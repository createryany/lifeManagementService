<template>
  <div>
    <a-form :form="form" style="margin: 20px auto 0;">
      <a-row>
        <a-col :span="12">
          <a-form-item label="所属公司" :labelCol="labelCol" :wrapperCol="wrapperCol">
            <a-select
              @change="company"
              v-decorator="[
                'company',
                { rules: [{ required: true, message: '所属公司必须填写', trigger: 'change' }] },
              ]"
            >
              <a-select-option :key="index" :value="item.id+''" v-for="(item, index) in select">
                {{ item.companyFullName }}
              </a-select-option>
            </a-select>
          </a-form-item>
        </a-col>
      </a-row>
      <a-row>
        <a-col :span="12">
          <a-form-item label="选择住宅" :labelCol="labelCol" :wrapperCol="wrapperCol">
            <a-select
              @change="estate"
              v-decorator="[
                'estate',
                { rules: [{ required: true, message: '选择住宅必须填写', trigger: 'change' }] },
              ]"
            >
              <a-select-option :key="index" :value="item.estateCode" v-for="(item, index) in estateSelect">
                {{ item.estateName }}
              </a-select-option>
            </a-select>
          </a-form-item>
        </a-col>
        <a-col :span="12">
          <a-form-item label="新增楼宇数量" :labelCol="labelCol" :wrapperCol="wrapperCol">
            <a-input
              v-decorator="[
                'addhomecount',
                { rules: [{ required: true, message: '新增楼宇数量必须填写', trigger: 'change' }] },
              ]"
            />
          </a-form-item>
        </a-col>
      </a-row>
      <a-form-item :wrapperCol="{span: 19, offset: 5}">
        <a-button type="primary" @click="nextStep">下一步</a-button>
        <a-button style="margin-left: 10px;" @click="resetForm">重置</a-button>
      </a-form-item>
    </a-form>
  </div>
</template>

<script>
import { selectCompanys, searchEstate } from '@/api/estate'
import QS from 'qs'

export default {
  name: 'Step1',
  data() {
    return {
      labelCol: { lg: { span: 6 }, sm: { span: 4 } },
      wrapperCol: { lg: { span: 16 }, sm: { span: 20 } },
      form: this.$form.createForm(this),
      select: [],
      estateSelect: []
    }
  },
  created() {
    selectCompanys().then(res => {
      this.select = res.result
    }).catch(() => {
      this.$notification['error']({
        message: '错误',
        description: '请求参数错误',
        duration: 1
      })
    })
  },
  methods: {
    company(value) {
      searchEstate(QS.stringify({ company: value })).then(res => {
        const result = res.result
        for (let i = 0; i < result.length; i++) {
          this.estateSelect.push({
            estateName: result[i].estateName,
            estateCode: result[i].estateCode
          })
        }
      }).catch(() => {
        this.$notification['error']({
          message: '错误',
          description: '请求参数错误',
          duration: 1
        })
      })
    },
    estate(value) {
      console.log(value)
    },
    nextStep(e) {
      e.preventDefault()
      this.form.validateFieldsAndScroll((err, values) => {
        if (!err) {
          this.$emit('nextStep')
          console.log('Received values of form: ', values)
        }
      })
    },
    resetForm() {
      this.$confirm({
        title: '提示',
        content: '您确定要重置吗 ?',
        onOk: () => {
          window.reload()
        },
        onCancel() {
        }
      })
    }
  }
}
</script>

<style lang="less" scoped>
.step-form-style-desc {
  padding: 0 56px;
  color: rgba(0, 0, 0, 0.45);

  h3 {
    margin: 0 0 12px;
    color: rgba(0, 0, 0, 0.45);
    font-size: 16px;
    line-height: 32px;
  }

  h4 {
    margin: 0 0 4px;
    color: rgba(0, 0, 0, 0.45);
    font-size: 14px;
    line-height: 22px;
  }

  p {
    margin-top: 0;
    margin-bottom: 12px;
    line-height: 22px;
  }
}

.ant-form-item {
  margin-bottom: 8px;
}
</style>
