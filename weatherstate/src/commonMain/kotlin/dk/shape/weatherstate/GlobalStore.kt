package dk.shape.weatherstate

import dk.shape.weatherstate.framework.redux.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class DefaultStore<AppState : State>(
    initialState: AppState,
    private val reducer: Reducer<AppState>,
    private val middleware: List<Middleware<AppState>>
) : Store<AppState>, CoroutineScope {

    private val _state = MutableStateFlow(initialState)
    override val state: StateFlow<AppState> = _state

    override fun dispatch(action: Action) {
        launch {
            val newAction = applyMiddleware(state.value, action)
            _state.value = reducer(state.value, newAction)

        }
    }

    private fun applyMiddleware(state: AppState, action: Action): Action {
        return next(0)(state, action, ::dispatch)
    }

    private fun next(index: Int): Next<AppState> {
        if (index == middleware.size) {
            // Last link of the chain. It just returns the action as is.
            return { _, action, _ -> action }
        }
        return { state, action, dispatch ->
            middleware[index].invoke(
                state,
                action,
                dispatch,
                next(index + 1)
            )
        }
    }

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main
}