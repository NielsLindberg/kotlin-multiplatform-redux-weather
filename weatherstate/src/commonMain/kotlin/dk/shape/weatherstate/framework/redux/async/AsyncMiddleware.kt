package dk.shape.weatherstate.framework.redux.async

import dk.shape.weatherstate.framework.redux.*
import dk.shape.weatherstate.navigation.NavigateActions
import dk.shape.weatherstate.places.FetchLocationsAction
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class AsyncMiddleware<AppState : State> : Middleware<AppState>, CoroutineScope {
    override fun invoke(
        state: AppState,
        action: Action,
        dispatch: Dispatch,
        next: Next<AppState>
    ): Action {
        when (action) {
            is AsyncAction -> {
                launch {
                    action.asyncFun.invoke()
                }
            }
            is NavigateActions.PlacesScreen -> dispatch(FetchLocationsAction())
        }
        return next(state, action, dispatch)
    }

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Default
}
