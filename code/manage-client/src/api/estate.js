import { axios } from '@/utils/request'

export function selectCompanys() {
    return axios({
        url: '/estate/selectCompanys',
        method: 'get'
    })
}