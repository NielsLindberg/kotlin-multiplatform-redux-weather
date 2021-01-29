package dk.shape.weatherstate.framework.redux.async

import dk.shape.weatherstate.framework.redux.Action

open class AsyncAction(val asyncFun: suspend () -> Unit): Action()