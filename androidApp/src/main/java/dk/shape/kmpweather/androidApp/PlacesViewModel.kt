package dk.shape.kmpweather.androidApp

import androidx.recyclerview.widget.DiffUtil
import dk.shape.weatherstate.DI
import dk.shape.weatherstate.places.FetchLocationsAction
import dk.shape.weatherstate.places.Place
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import me.tatarka.bindingcollectionadapter2.collections.DiffObservableList
import me.tatarka.bindingcollectionadapter2.itembindings.OnItemBindClass
import me.tatarka.bindingcollectionadapter2.BR
import timber.log.Timber
import kotlin.coroutines.CoroutineContext

class PlacesViewModel: CoroutineScope {
    val placeItems = DiffObservableList<PlaceViewModel>(itemDiffCallback)
    val placeView = OnItemBindClass<Any>().map(PlaceViewModel::class.java, BR.vm, R.layout.place_view)

    init {
       // Replace @Mutable from composable with some cross platform observing pattern.
        DI.dispatch(FetchLocationsAction())
        launch {
            DI.store.state.collect { state ->
                Timber.d("$state")
                placeItems.update(state.placesState.places.map { PlaceViewModel(it) })
            }
        }
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

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

}