package dk.shape.weatherstate.framework.redux

typealias Next<AppState> = (AppState, Action, Dispatch) -> Action