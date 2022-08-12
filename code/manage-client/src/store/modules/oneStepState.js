const oneStepState = {
  state: {
    buildingNumber: '',
    estateCode: ''
  },
  mutations: {
    SET_BUILDINGNUMBER: (state, playload) => {
      state.buildingNumber = playload.buildingNumber
      state.estateCode = playload.estateCode
    }
  },
  actions: {}
}
export default oneStepState
