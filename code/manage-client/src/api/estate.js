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

export function searchUnitMsg(parameterData) {
  return axios({
    url: '/estate/searchUnitMsg',
    method: 'post',
    data: parameterData,
    headers: {
      'Content-Type': 'application/json;charset=UTF-8'
    }
  })
}

export function updateUnitMsg(parameterData) {
  return axios({
    url: '/estate/updateUnitMsg',
    method: 'post',
    data: parameterData
  })
}

export function addCell(parameterData) {
  return axios({
    url: '/estate/addCell',
    method: 'post',
    data: parameterData,
    headers: {
      'Content-Type': 'application/json;charset=UTF-8'
    }
  })
}

export function searchBaseBuildMsg(parameterData) {
  return axios({
    url: '/estate/searchBaseBuildMsg',
    method: 'post',
    data: parameterData
  })
}

export function searchBaseUnitMsg(parameterData) {
  return axios({
    url: '/estate/searchBaseUnitMsg',
    method: 'post',
    data: parameterData
  })
}

export function searchCellMsg(parameterData) {
  return axios({
    url: '/estate/searchCellMsg',
    method: 'post',
    data: parameterData
  })
}

export function updateCellMsg(parameterData) {
  return axios({
    url: '/estate/updateCellMsg',
    method: 'post',
    data: parameterData
  })
}

export function getBuildMsg() {
  return axios({
    url: '/estate/getBuildMsg',
    method: 'post'
  })
}

export function getUnitMsg() {
  return axios({
    url: '/estate/getUnitMsg',
    method: 'post'
  })
}

export function updateCacheBuildingMsg(parameterData) {
  return axios({
    url: '/estate/updateCacheBuildingMsg',
    method: 'post',
    data: parameterData
  })
}

export function updateCacheUnitMsg(parameterData) {
  return axios({
    url: '/estate/updateCacheUnitMsg',
    method: 'post',
    data: parameterData
  })
}

export function updateCacheCellMsg(parameterData) {
  return axios({
    url: '/estate/updateCacheCellMsg',
    method: 'post',
    data: parameterData
  })
}
