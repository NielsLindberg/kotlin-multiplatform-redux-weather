package dk.shape.kmpweather.androidApp

import android.view.View
import dk.shape.weatherstate.DI
import dk.shape.weatherstate.forecast.FetchForecastAction
import dk.shape.weatherstate.places.Place

class PlaceViewModel(val place: Place) {
    fun onClick(v: View) {
        DI.dispatch(FetchForecastAction(place.woeId))
    }
}