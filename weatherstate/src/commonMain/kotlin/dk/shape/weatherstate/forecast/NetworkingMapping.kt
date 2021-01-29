package dk.shape.weatherstate.forecast

import dk.shape.networking.forecast.ForecastGroupResponse
import dk.shape.networking.forecast.ForecastResponse
import dk.shape.weatherstate.utils.longDate
import dk.shape.weatherstate.utils.unixToDate

fun ForecastGroupResponse.asForecast(): Forecast? {
    val woeId = city?.id?.toString() ?: return null
    val cityName = city?.name ?: return null
    val country = city?.countryCode ?: return null
    val observations = forecasts.orEmpty().mapNotNull { it.asForecastObservation() }
    val dailyForecasts = groupForecastDaily(observations) ?: return null

    return Forecast(
        woeId = woeId,
        city = cityName,
        country = country,
        dailyForecasts = dailyForecasts,
        selectedDaily = dailyForecasts.first()
    )
}

fun ForecastResponse.asForecastObservation(): ForecastObservation? {

    val date = unixToDate(date) ?: return null
    val temperature = parameters?.temperature?.toInt() ?: return null
    val weatherImage = weather?.firstOrNull()?.icon ?: return null
    val weatherType = weather?.firstOrNull()?.name ?: return null
    val weatherSubType = weather?.firstOrNull()?.description ?: return null

    return ForecastObservation(
        date = date,
        temperature = Temperature(
            value = temperature,
            unit = TemperatureUnit.Celsius),
        weatherImage = weatherImage,
        weatherType = weatherType,
        weatherSubType = weatherSubType
    )
}

fun groupForecastDaily(observations: List<ForecastObservation>): List<ForecastDaily>? {
    // Probably easier to use the daily API endpoint but its behind a paywall.
    return observations.groupBy { it.date.longDate() }.mapNotNull { groups ->
        with(groups.value) {
            val maxFreqWeatherType = groupBy{ obs -> obs.weatherType }.maxBy { it.value.size }?.value?.firstOrNull()
            val maxFreqWeatherSubType = groupBy{ obs -> obs.weatherSubType }.maxBy { it.value.size }?.value?.firstOrNull()
            ForecastDaily(
                date = groups.value.first().date,
                minTemperature = Temperature(
                    value = minByOrNull { obs -> obs.temperature.value }
                        ?.temperature?.value ?: -99,
                    unit = TemperatureUnit.Celsius
                ),
                maxTemperature = Temperature(
                    value = maxByOrNull { obs -> obs.temperature.value }
                        ?.temperature?.value ?: 99,
                    unit = TemperatureUnit.Celsius
                ),
                weatherImage = maxFreqWeatherSubType?.weatherImage ?: "N/A",
                weatherType = maxFreqWeatherType?.weatherType ?: "N/A",
                weatherSubType = maxFreqWeatherSubType?.weatherSubType ?: "N/A",
                observations = this
            )
        }

    }
}