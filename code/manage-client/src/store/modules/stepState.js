const stepState = {
  state: {
    buildingNumber: '',
    estateCode: '',
    isCreated: false,
    unitMessage: [],
    cellMessage: [],
    step3Msg: [],
    step4Msg: []
  },
  mutations: {
    SET_STEP1: (state, playload) => {
      state.buildingNumber = playload.buildingNumber
      state.estateCode = playload.estateCode
      state.isCreated = playload.isCreated
    },
    SET_STEP2: (state, playload) => {
      state.unitMessage = playload.unitMessage
      state.isCreated = playload.isCreated
    },
    SET_STEP3: (state, playload) => {
      state.cellMessage = playload.cellMessage
      state.isCreated = playload.isCreated
    }
  },
  actions: {}
}
export default stepState
