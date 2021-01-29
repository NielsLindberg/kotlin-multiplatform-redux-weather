package dk.shape.networking.places

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlaceResponse(
    @SerialName("coord") val location: LocationResponse? = null,
    @SerialName("sys") val details: PlaceDetailsResponse? = null,
    @SerialName("main") val parameters: PlaceParametersResponse? = null,
    @SerialName("weather") val weathers: List<PlaceWeatherResponse>? = null,
    @SerialName("id") val id: Int? = null,
    @SerialName("name") val name: String? = null
)