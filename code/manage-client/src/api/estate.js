import { axios } from '@/utils/request'

export function selectCompanys() {
  return axios({
    url: '/estate/selectCompanys',
    method: 'get'
  })
}

export function addEstate(data) {
  return axios({
    url: '/estate/addEstate',
    method: 'post',
    data: data
  })
}

export function searchBuild(parameterData) {
  return axios({
    url: '/estate/searchBuild',
    method: 'post',
    data: parameterData
  })
}

export function updateBuildingMsg(parameterData) {
  return axios({
    url: '/estate/updateBuildingMsg',
    method: 'post',
    data: parameterData
  })
}
