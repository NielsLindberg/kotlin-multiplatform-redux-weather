package dk.shape.kmpweather.androidApp

import androidx.recyclerview.widget.DiffUtil
import dk.shape.weatherstate.DI
import dk.shape.weatherstate.places.FetchLocationsAction
import dk.shape.weatherstate.places.Place
import me.tatarka.bindingcollectionadapter2.collections.DiffObservableList
import me.tatarka.bindingcollectionadapter2.itembindings.OnItemBindClass
import me.tatarka.bindingcollectionadapter2.BR

class PlacesViewModel {
    var places: List<Place> = emptyList()
        set(value) {
            field = value
            placeItems.update(value.map { PlaceViewModel(it) })
        }

    val placeItems = DiffObservableList<PlaceViewModel>(itemDiffCallback)
    val placeView = OnItemBindClass<Any>().map(PlaceViewModel::class.java, BR.vm, R.layout.place_view)

    init {
       // Replace @Mutable from composable with some cross platform observing pattern.
        DI.dispatch(FetchLocationsAction())
        places = DI.store.state.value.placesState.places

    }

    companion object {
        private val itemDiffCallback = object : DiffUtil.ItemCallback<PlaceViewModel?>() {
            override fun areItemsTheSame(
                oldItem: PlaceViewModel,
                newItem: PlaceViewModel
            ): Boolean {
                return oldItem.place.woeId == newItem.place.woeId
            }

            override fun areContentsTheSame(
                oldItem: PlaceViewModel,
                newItem: PlaceViewModel
            ): Boolean {
                // Place is a data class and does property equality.
                return oldItem.place == newItem.place
            }
        }
    }

}