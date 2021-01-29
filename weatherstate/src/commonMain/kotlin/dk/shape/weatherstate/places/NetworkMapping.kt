package dk.shape.weatherstate.places

import dk.shape.networking.places.PlaceGroupResponse
import dk.shape.networking.places.PlaceResponse
import dk.shape.weatherstate.forecast.Temperature
import dk.shape.weatherstate.forecast.TemperatureUnit
import dk.shape.weatherstate.utils.getCountryNameFromCountryCode

fun PlaceGroupResponse.asPlaces(): List<Place> {
    return places.orEmpty().mapNotNull { it.asPlace() }
}

fun PlaceResponse.asPlace(): Place? {
    val woeId = id?.toString() ?: return null
    val weatherCode = weathers?.firstOrNull()?.id ?: return null
    val city = name ?: return null
    val country = getCountryNameFromCountryCode(details?.countryCode) ?: return null
    val temperature = parameters?.temperature?.toInt() ?: return null
    val weather = weathers?.firstOrNull()
    val icon = weather?.icon


    return Place(
        woeId = woeId,
        city = city,
        country = country,
        temperature = Temperature(
            value = temperature,
            unit = TemperatureUnit.Celsius
        ),
        weatherCode = weatherCode,
        icon = weather?.icon,
        name = weather?.name,
        description = weather?.description)
}