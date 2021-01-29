package dk.shape.weatherstate.error_handling

import dk.shape.weatherstate.framework.redux.Reducer


val ErrorStateReducer: Reducer<ErrorState> = { old, action ->
    when (action) {
        //is CounterActions.GeneralError -> ErrorState(message = action.error.message)
        else -> old
    }
}