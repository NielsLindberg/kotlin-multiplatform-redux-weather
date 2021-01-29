package dk.shape.weatherstate.utils


fun getCountryNameFromCountryCode(countryCode: String?): String? {
    val code = countryCode ?: return null
    return code
    //return Locale("", code).displayCountry
}