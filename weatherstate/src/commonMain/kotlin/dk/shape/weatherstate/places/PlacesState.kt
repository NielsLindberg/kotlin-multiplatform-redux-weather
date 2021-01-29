package dk.shape.weatherstate.places

data class PlacesState(
    val places: List<Place> = emptyList(),
    val errorMessage: String? = null
)