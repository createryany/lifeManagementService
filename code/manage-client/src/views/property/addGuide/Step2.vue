<template>
  <div>
    <!-- <a-form-model ref="ruleForm" :model="form2" :label-col="labelCol" :wrapper-col="wrapperCol"> -->
    <a-row class="header" :id="form2.isAble?'h120':''">
      <div style="display: inline-block;margin-left: 30px;margin-top: 30px;">
        楼宇数量:
        <span style="color: #001529;font-weight: 700;">{{ this.$store.state.stepState.buildingNumber }}</span>
      </div>
      <div style="display: inline-block;margin-left: 30px;">
        单元数量:
        <a-select v-model="form2.region" @change="change()">
          <a-select-option value="1">1</a-select-option>
          <a-select-option value="2">2</a-select-option>
          <a-select-option value="3">3</a-select-option>
          <a-select-option value="4">4</a-select-option>
          <a-select-option value="5">5</a-select-option>
          <a-select-option value="6">6</a-select-option>
        </a-select>
      </div>
      <div style="display: inline-block;margin-left: 30px;">
        封顶日期和竣工日期:
        <a-range-picker v-model="form2.ofDate" :format="form2.format" @blur="changeDate()"/>
      </div>
      <div style="display: inline-block;margin-left: 30px;">
        预售许可证:
        <a-input style="width: 300px;padding: 0;text-align: center;" v-model="form2.salePermission" @blur="changeSalePer()"></a-input>
      </div>
      <a-button type="primary" class="isShow" @click="isShow()" :open="false">{{ this.form2.isAble?'收起':'展开' }}</a-button>
      <span v-show="form2.isAble" style="display: inline-block;margin-left: 30px;margin-top: 20px;">
        建筑许可证:
        <a-input style="width: 300px;padding: 0;text-align: center;" v-model="form2.buildPermission" @blur="changeBuildPer()"></a-input>
      </span>
      <span v-show="form2.isAble" style="display: inline-block;margin-left: 30px;margin-top: 20px;">
        建筑面积:
        <a-input style="width: 300px;padding: 0;text-align: center;" v-model="form2.areaForBuild" @blur="changeAreaB()"></a-input>
      </span>
      <span v-show="form2.isAble" style="display: inline-block;margin-left: 30px;margin-top: 20px;">
        使用面积:
        <a-input style="width: 300px;padding: 0;text-align: center;" v-model="form2.areaForUsed" @blur="changeAreaU()"></a-input>
      </span>
    </a-row>
    <a-row>
      <a-table :columns="columns" :dataSource="data" bordered align="center">
        <template
          v-for="col in [
            'buildingCode',
            'buildingName',
            'unitCount',
            'overRoofDate',
            'finishDate',
            'salePermissionId',
            'buildPermissionId',
            'buildArea',
            'usedArea',
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
            <template v-else> {{ text }} </template>
          </div>
        </template>
        <template slot="operation" slot-scope="text, record">
          <div class="editable-row-operations">
            <span v-if="record.editable">
              <a @click="() => save(record.key)">保存</a>
              <a-popconfirm title="确认取消吗?" @confirm="() => cancel(record.key)">
                <a>取消</a>
              </a-popconfirm>
            </span>
            <span v-else>
              <a :disabled="editingKey !== ''" @click="() => edit(record.key)">编 辑</a>
            </span>
          </div>
        </template>
      </a-table>
      <a-row>
        <a-button type="primary" @click="nextStep()">下一步</a-button>
      </a-row>
    </a-row>
  </div>
</template>

<script>
import { searchBuild, getBuildMsg, updateBuildingMsg, updateCacheBuildingMsg } from '@/api/estate'
import QS from 'qs'
import moment from 'moment'
import zhCN from 'ant-design-vue/lib/locale-provider/zh_CN'

const columns = [
  {
    align: 'center',
    title: '楼宇编码',
    dataIndex: 'buildingCode',
    width: '6%',
    scopedSlots: { customRender: 'buildingCode' }
  },
  {
    align: 'center',
    title: '楼宇名称',
    dataIndex: 'buildingName',
    width: '15%',
    scopedSlots: { customRender: 'buildingName' }
  },
  {
    align: 'center',
    title: '单元数量',
    dataIndex: 'unitCount',
    width: '6%',
    scopedSlots: { customRender: 'unitCount' }
  },
  {
    align: 'center',
    title: '封顶日期',
    dataIndex: 'overRoofDate',
    width: '7%',
    scopedSlots: { customRender: 'overRoofDate' }
  },
  {
    align: 'center',
    title: '竣工日期',
    dataIndex: 'finishDate',
    width: '7%',
    scopedSlots: { customRender: 'finishDate' }
  },
  {
    align: 'center',
    title: '预售许可证',
    dataIndex: 'salePermissionId',
    width: '7%',
    scopedSlots: { customRender: 'salePermissionId' }
  },
  {
    align: 'center',
    title: '建筑许可证',
    dataIndex: 'buildPermissionId',
    width: '7%',
    scopedSlots: { customRender: 'buildPermissionId' }
  },
  {
    align: 'center',
    title: '建筑面积',
    dataIndex: 'buildArea',
    width: '6%',
    scopedSlots: { customRender: 'buildArea' }
  },
  {
    align: 'center',
    title: '使用面积',
    dataIndex: 'usedArea',
    width: '6%',
    scopedSlots: { customRender: 'usedArea' }
  },
  {
    align: 'center',
    title: '备注',
    dataIndex: 'remark',
    width: '10%',
    scopedSlots: { customRender: 'remark' }
  },
  {
    align: 'center',
    title: '编辑',
    width: '4%',
    dataIndex: 'operation',
    scopedSlots: { customRender: 'operation' }
  }
]

const data = []

export default {
  name: 'Step2',
  data() {
    return {
      labelCol: { span: 2 },
      wrapperCol: { span: 1 },
      form2: {
        name: '',
        region: '',
        salePermission: '',
        buildPermission: '',
        areaForBuild: '',
        areaForUsed: '',
        isAble: false,
        isOpen: '展开',
        format: 'YYYY/MM/DD',
        ofDate: [moment('2022/01/01'), moment('2022/12/31')],
        locale: zhCN
      },
      data,
      columns,
      editingKey: '',
      locale: zhCN
    }
  },
  methods: {
    change() {
      const unitCount = this.form2.region
      for (let i = 0; i < this.data.length; i++) {
        this.data[i].unitCount = unitCount
      }
    },
    nextStep() {
      const dataArray = this.data
      let unitMessage = '['
      for (let i = 0; i < dataArray.length; i++) {
        if (i !== dataArray.length - 1) {
          unitMessage += '{ "estateCode": "' + this.$store.state.stepState.estateCode + '", "buildingCode" : "' + dataArray[i].buildingCode + '", "unitCount": ' + dataArray[i].unitCount + '},'
        } else {
          unitMessage += '{ "estateCode": "' + this.$store.state.stepState.estateCode + '", "buildingCode" : "' + dataArray[i].buildingCode + '", "unitCount": ' + dataArray[i].unitCount + '}]'
        }
      }
      this.$store.commit('SET_STEP2', {
        unitMessage: unitMessage,
        isCreated: true
      })
      let unitCountMsg = 0
      for (let j = 0; j < dataArray.length; j++) {
        dataArray[j].id = dataArray[j].key
        delete dataArray[j].key
        dataArray[j].overRoofDate = moment(dataArray[j].overRoofDate).format('YYYY-MM-DD')
        dataArray[j].finishDate = moment(dataArray[j].finishDate).format('YYYY-MM-DD')
        if (dataArray[j].unitCount !== null) {
          unitCountMsg += 1
        }
      }
      if (unitCountMsg !== dataArray.length) {
        console.log('欸欸欸欸欸欸额', unitCountMsg, dataArray.length)
        this.$notification.warn({
          message: '您好',
          description: '每个单元数量不能小于 1'
        })
        unitCountMsg = 0
      } else {
        updateCacheBuildingMsg(dataArray).then(res => {
          const failMessage = res.message
          if (failMessage !== '') {
            this.$notification['error']({
              message: '抱歉',
              description: failMessage
            })
          }
        }).catch(() => {
          this.$notification['error']({
            message: '错误',
            description: '请求参数错误'
          })
        })
        unitCountMsg = 0
        this.$emit('nextStep')
      }
    },
    isShow() {
      this.form2.isAble = !this.form2.isAble
    },
    changeSalePer() {
      for (let i = 0; i < this.data.length; i++) {
        this.data[i].salePermissionId = this.form2.salePermission
      }
    },
    changeBuildPer() {
      for (let i = 0; i < this.data.length; i++) {
        this.data[i].buildPermissionId = this.form2.buildPermission
      }
    },
    changeAreaB() {
      for (let i = 0; i < this.data.length; i++) {
        this.data[i].buildArea = this.form2.areaForBuild
      }
    },
    changeAreaU() {
      for (let i = 0; i < this.data.length; i++) {
        this.data[i].usedArea = this.form2.areaForUsed
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
    changeDate() {
      const dataArray = this.data
      for (let i = 0; i < dataArray.length; i++) {
        dataArray[i].overRoofDate = moment(this.form2.ofDate[0]).format(this.form2.format)
        dataArray[i].finishDate = moment(this.form2.ofDate[1]).format(this.form2.format)
      }
    },
    edit(key) {
      const newData = [...this.data]
      const target = newData.filter(item => key === item.key)[0]
      this.editingKey = key
      if (target) {
        target.editable = true
        this.data = newData
        this.editingKey = ''
      }
    },
    save(key) {
      const newData = [...this.data]
      const newCacheData = [...this.cacheData]
      const target = newData.filter(item => key === item.key)[0]
      const targetCache = newCacheData.filter(item => key === item.key)[0]
      if (target && targetCache) {
        delete target.editable
        this.data = newData
        Object.assign(targetCache, target)
        this.cacheData = newCacheData
      }
      if (target.unitCount === null || target.unitCount === 0) {
        this.$notification.warn({
          message: '您好',
          description: '单元数量不能小于 1'
        })
      } else {
        target.id = key
        target.estateCode = this.$store.state.stepState.estateCode
        if (target.remark == null) target.remark = '无'
        target.overRoofDate = moment(target.overRoofDate).format(this.form2.format)
        target.finishDate = moment(target.finishDate).format(this.form2.format)
        const parameterData = QS.stringify(target)
        console.log(parameterData)
        updateBuildingMsg(parameterData).then(res => {
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
        }).catch(() => {
          this.$notification['error']({
            message: '错误',
            description: '请求出现错误，请稍后再试',
            duration: 4
          })
        })
      }
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
      const buildData = {
        estateCode: this.$store.state.stepState.estateCode,
        buildingNumber: this.$store.state.stepState.buildingNumber
      }
      const parameterData = QS.stringify(buildData)
      searchBuild(parameterData).then(res => {
        const result = res.result
        const myData = []
        if (result.length) {
          for (let i = 0; i < result.length; i++) {
            const building = result[i]
            if (building.overRoofDate === null) building.overRoofDate = moment(this.form2.ofDate[0]).format(this.form2.format)
            if (building.finishDate === null) building.finishDate = moment(this.form2.ofDate[1]).format(this.form2.format)
            myData.push({
              key: building.id,
              buildingCode: building.buildingCode,
              buildingName: building.buildingName,
              unitCount: building.unitCount,
              overRoofDate: building.overRoofDate,
              finishDate: building.finishDate,
              salePermissionId: building.salePermissionId,
              buildPermissionId: building.buildPermissionId,
              buildArea: building.buildArea,
              usedArea: building.usedArea,
              remark: building.remark
            })
          }
          this.data = myData
          this.cacheData = this.data.map(item => ({ ...item }))
        } else {
          this.$notification.warning({
            message: '您好',
            description: res.message
          })
        }
      }).catch(() => {
        this.$notification['error']({
          message: '错误',
          description: '请求出现错误，请稍后再试',
          duration: 4
        })
      })
    } else {
      getBuildMsg().then(res => {
        const result = res.result
        const myData = []
        if (result.length) {
          for (let i = 0; i < result.length; i++) {
            const building = result[i]
            myData.push({
              key: building.id,
              buildingCode: building.buildingCode,
              buildingName: building.buildingName,
              unitCount: building.unitCount,
              overRoofDate: moment(building.overRoofDate).format('YYYY/MM/DD'),
              finishDate: moment(building.finishDate).format('YYYY/MM/DD'),
              salePermissionId: building.salePermissionId,
              buildPermissionId: building.buildPermissionId,
              buildArea: building.buildArea,
              usedArea: building.usedArea,
              remark: building.remark
            })
          }
          this.data = myData
          this.cacheData = this.data.map(item => ({ ...item }))
        } else {
          this.$notification.warning({
            message: '您好',
            description: res.message
          })
        }
      }).catch(() => {
        this.$notification['error']({
          message: '错误',
          description: '请求出现错误，请稍后再试',
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
.isShow {
  display: inline-block;
  width: 72px;
  height: 32px;
  margin-left: 30px;
  margin-top: 24px;
}
#h120 {
  height: 120px;
}
</style>
