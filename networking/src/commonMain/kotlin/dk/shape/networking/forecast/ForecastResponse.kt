package dk.shape.networking.forecast

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastResponse(
        @SerialName("dt") val date: Long?,
        @SerialName("main") val parameters: ForecastParametersResponse?,
        @SerialName("weather") val weather: List<ForecastWeatherResponse>?
)
