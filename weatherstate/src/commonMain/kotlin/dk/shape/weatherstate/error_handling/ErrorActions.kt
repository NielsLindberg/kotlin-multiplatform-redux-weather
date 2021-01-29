package dk.shape.weatherstate.error_handling

import dk.shape.weatherstate.framework.redux.Action

open class ErrorActions(errorMessage: String): Action(errorMessage)