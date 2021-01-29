package dk.shape.weatherstate.framework.redux.logger

import dk.shape.weatherstate.DI
import dk.shape.weatherstate.framework.redux.*

class LoggerMiddleware<AppState : State> : Middleware<AppState> {
    override fun invoke(
        state: AppState,
        action: Action,
        dispatch: Dispatch,
        next: Next<AppState>
    ): Action {
        DI.logger?.log("$action")
        return next(state, action, dispatch)
    }
}