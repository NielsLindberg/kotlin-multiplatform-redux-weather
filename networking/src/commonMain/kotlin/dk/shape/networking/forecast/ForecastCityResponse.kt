package dk.shape.networking.forecast

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class ForecastCityResponse (
    @SerialName("id") val id: Int?,
    @SerialName("name") val name: String?,
    @SerialName("coord") val location: ForecastLocationResponse?,
    @SerialName("country") val countryCode: String?
)