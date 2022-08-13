<template>
  <div>
    <!-- <a-form-model ref="ruleForm" :model="form2" :label-col="labelCol" :wrapper-col="wrapperCol"> -->
    <a-row class="header">
      选择楼宇:
      <a-select style="min-width: 66px;" v-model="form2.buildingMsg" @change="changeBuildingMsg()">
        <a-select-option
          :key="index"
          :value="item.buildingCode"
          v-for="(item, index) in buildingMsg"
        >{{ item.buildingName }}
        </a-select-option>
      </a-select>
      选择单元:
      <a-select style="min-width: 90px;" v-model="form2.unit" @change="changeCellMsg()">
        <a-select-option
          :key="index"
          :value="item.unitCode"
          v-for="(item, index) in unit"
        >{{ item.unitName }}</a-select-option>
      </a-select>
      建筑面积:
      <a-input style="width: 40px;padding: 0;text-align: center;" v-model="form2.buildArea" @blur="changeBuildArea()"></a-input>
      使用面积:
      <a-input style="width: 40px;padding: 0;text-align: center;" v-model="form2.usedArea" @blur="changeUsedArea()"></a-input>
    </a-row>
    <a-row>
      <a-table :columns="columns" :dataSource="data" bordered align="center">
        <template
          v-for="col in [
            'floorNumber',
            'unitCode',
            'cellCode',
            'cellName',
            'cellBuildArea',
            'cellUsedArea',
            'remark'
          ]"
          :slot="col"
          slot-scope="text, record"
        >
          <div :key="col">
            <a-input
              v-if="record.editable"
              style="margin: -5px 0"
              :value="text"
              @change="e => handleChange(e.target.value, record.key, col)"
            />
            <template v-else>{{ text }}</template>
          </div>
        </template>
        <template slot="operation" slot-scope="text, record">
          <div class="editable-row-operations">
            <span v-if="record.editable">
              <a @click="() => save(record.key)">保存</a>&nbsp;
              <a-popconfirm title="确认取消吗?" @confirm="() => cancel(record.key)">
                <a>取消</a>
              </a-popconfirm>
            </span>
            <span v-else>
              <a :disabled="editingKey !== ''" @click="() => edit(record.key)">编辑</a>
            </span>
          </div>
        </template>
      </a-table>
      <a-row>
        <a-button type="primary" @click="prevStep()">上一步</a-button>
        <a-button style="margin-left: 10px;" type="primary" @click="nextStep()">下一步</a-button>
      </a-row>
    </a-row>
  </div>
</template>

<script>
import { addCell, searchBaseBuildMsg, searchBaseUnitMsg, searchCellMsg, updateCellMsg } from '@/api/estate'
import QS from 'qs'

const columns = [
  {
    align: 'center',
    title: '楼层数',
    dataIndex: 'floorNumber',
    width: '6%',
    scopedSlots: { customRender: 'floorNumber' }
  },
  {
    align: 'center',
    title: '单元编号',
    dataIndex: 'unitCode',
    width: '6%',
    scopedSlots: { customRender: 'unitCode' }
  },
  {
    align: 'center',
    title: '房间编号',
    dataIndex: 'cellCode',
    width: '6%',
    scopedSlots: { customRender: 'cellCode' }
  },
  {
    align: 'center',
    title: '房间名称',
    dataIndex: 'cellName',
    width: '6%',
    scopedSlots: { customRender: 'cellName' }
  },
  {
    align: 'center',
    title: '建筑面积(平方米)',
    dataIndex: 'cellBuildArea',
    width: '8%',
    scopedSlots: { customRender: 'cellBuildArea' }
  },
  {
    align: 'center',
    title: '使用面积(平方米)',
    dataIndex: 'cellUsedArea',
    width: '8%',
    scopedSlots: { customRender: 'cellUsedArea' }
  },
  {
    align: 'center',
    title: '备注',
    dataIndex: 'remark',
    width: '35%',
    scopedSlots: { customRender: 'remark' }
  },
  {
    align: 'center',
    title: '编辑',
    width: '7%',
    dataIndex: 'operation',
    scopedSlots: { customRender: 'operation' }
  }
]

const data = []

export default {
  name: 'Step4',
  data() {
    return {
      labelCol: { span: 2 },
      wrapperCol: { span: 1 },
      form2: {
        name: '',
        region: undefined,
        buildArea: '',
        usedArea: '',
        buildingMsg: [],
        unit: [],
        date1: undefined,
        delivery: false,
        type: [],
        resource: '',
        desc: ''
      },
      data,
      columns,
      editingKey: '',
      buildingMsg: [],
      unit: []
    }
  },
  methods: {
    nextStep() {
      this.$emit('nextStep')
    },
    prevStep() {
      this.$store.state.stepState.isCreated = false
      this.$emit('prevStep')
    },
    changeBuildingMsg() {
      searchBaseUnitMsg(QS.stringify({ buildingCode: this.form2.buildingMsg })).then(res => {
        const result = res.result
        if (result.length) {
          this.unit = result
        }
      }).catch(err => {
        this.$notification['error']({
          message: '错误',
          description: ((err.response || {}).data || {}).message || '请求出现错误，请稍后再试',
          duration: 4
        })
      })
    },
    changeCellMsg() {
      searchCellMsg(QS.stringify({ unitCode: this.form2.unit })).then(res => {
        const result = res.result
        const myData = []
        if (result.length) {
          for (let i = 0; i < result.length; i++) {
            const cell = result[i]
            myData.push({
              key: cell.id,
              floorNumber: cell.floorNumber,
              unitCode: cell.unitCode,
              cellCode: cell.cellCode,
              cellName: cell.cellName,
              cellBuildArea: cell.cellBuildArea,
              cellUsedArea: cell.cellUsedArea,
              remark: cell.remark
            })
          }
          this.data = myData
          this.cacheData = this.data.map(item => ({ ...item }))
        }
      }).catch(err => {
        this.$notification['error']({
          message: '错误',
          description: ((err.response || {}).data || {}).message || '请求出现错误，请稍后再试',
          duration: 4
        })
      })
    },
    changeBuildArea() {
      const buildArea = this.form2.buildArea
      for (let i = 0; i < this.data.length; i++) {
        this.data[i].cellBuildArea = buildArea
      }
    },
    changeUsedArea() {
      const usedArea = this.form2.usedArea
      for (let i = 0; i < this.data.length; i++) {
        this.data[i].cellUsedArea = usedArea
      }
    },
    handleChange(value, key, column) {
      const newData = [...this.data]
      const target = newData.filter(item => key === item.key)[0]
      if (target) {
        target[column] = value
        this.data = newData
      }
    },
    edit(key) {
      const newData = [...this.data]
      const target = newData.filter(item => key === item.key)[0]
      this.editingKey = key
      if (target) {
        target.editable = true
        this.data = newData
      }
    },
    save(key) {
      console.log(key)
      const newData = [...this.data]
      const newCacheData = [...this.cacheData]
      const target = newData.filter(item => key === item.key)[0]
      const targetCache = newCacheData.filter(item => key === item.key)[0]
      if (target && targetCache) {
        delete target.editable
        this.data = newData
        Object.assign(targetCache, target)
        this.cacheData = newCacheData
        this.editingKey = ''
      }
      target.id = key
      if (target.remark == null) target.remark = '无'
      const parameterData = QS.stringify(target)
      updateCellMsg(parameterData)
        .then(res => {
          const result = res.result
          if (result === 1) {
            this.$notification.success({
              message: '您好',
              description: res.message
            })
          } else {
            this.$notification.warning({
              message: '您好',
              description: res.message
            })
          }
        })
        .catch(err => {
          this.$notification['error']({
            message: '错误',
            description: ((err.response || {}).data || {}).message || '请求出现错误，请稍后再试',
            duration: 4
          })
        })
    },
    cancel(key) {
      const newData = [...this.data]
      const target = newData.filter(item => key === item.key)[0]
      this.editingKey = ''
      if (target) {
        Object.assign(target, this.cacheData.filter(item => key === item.key)[0])
        delete target.editable
        this.data = newData
      }
    }
  },
  created() {
    if (this.$store.state.stepState.isCreated) {
      addCell(this.$store.state.stepState.cellMessage)
        .then(res => {
          const result = res.result
          if (result.length) {
            for (let i = 0; i < result.length; i++) {
              const cell = result[i]
              data.push({
                key: cell.id,
                floorNumber: cell.floorNumber,
                unitCode: cell.unitCode,
                cellCode: cell.cellCode,
                cellName: cell.cellName,
                cellBuildArea: cell.cellBuildArea,
                cellUsedArea: cell.cellUsedArea,
                remark: cell.remark
              })
            }
            this.cacheData = data.map(item => ({ ...item }))
          }
        }).catch(err => {
        this.$notification['error']({
          message: '错误',
          description: ((err.response || {}).data || {}).message || '请求出现错误，请稍后再试',
          duration: 4
        })
      })
      searchBaseBuildMsg(QS.stringify({ estateCode: this.$store.state.stepState.estateCode }))
        .then(res => {
          const result = res.result
          if (result.length) {
            this.buildingMsg = result
          } else {
            this.$notification.warning({
              message: '您好',
              description: res.message
            })
          }
        })
        .catch(err => {
          this.$notification['error']({
            message: '错误',
            description: ((err.response || {}).data || {}).message || '请求出现错误，请稍后再试',
            duration: 4
          })
        })
    }
  },
  beforeDestroy() {
    //  clearTimeout(this.timer)
  }
}
</script>

<style lang="less" scoped>
.stepFormText {
  margin-bottom: 24px;

  .ant-form-item-label,
  .ant-form-item-control {
    line-height: 22px;
  }
}
</style>
