package dk.shape.weatherstate.framework.redux

import kotlinx.coroutines.flow.StateFlow

interface Store<AppState: State> {
    fun dispatch(action: Action)
    val state: StateFlow<AppState>
}