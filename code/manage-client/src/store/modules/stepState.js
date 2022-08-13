const stepState = {
  state: {
    buildingNumber: '',
    estateCode: '',
    isCreated: false,
    unitMessage: [],
    cellMessage: []
  },
  mutations: {
    SET_STEP1: (state, playload) => {
      state.buildingNumber = playload.buildingNumber
      state.estateCode = playload.estateCode
      state.isCreated = playload.isCreated
    },
    SET_STEP2: (state, playload) => {
      state.unitMessage = playload.unitMessage
    },
    SET_STEP3: (state, playload) => {
      state.cellMessage = playload.cellMessage
    }
  },
  actions: {}
}
export default stepState
