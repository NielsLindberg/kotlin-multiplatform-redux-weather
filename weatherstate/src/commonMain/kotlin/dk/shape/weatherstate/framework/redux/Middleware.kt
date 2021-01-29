package dk.shape.weatherstate.framework.redux

interface Middleware<AppState: State> {
    fun invoke(state: AppState, action: Action, dispatch: Dispatch, next: Next<AppState>): Action
}