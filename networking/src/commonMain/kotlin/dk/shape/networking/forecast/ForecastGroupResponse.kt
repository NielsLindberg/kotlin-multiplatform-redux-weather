package dk.shape.networking.forecast

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastGroupResponse (
    @SerialName("cnt") val cnt: Int?,
    @SerialName("city") val city: ForecastCityResponse?,
    @SerialName("list") val forecasts: List<ForecastResponse>?
)