package ivangladko.weatherapp.data.response


data class CurrentWeatherResponse(

    val currentWeatherEntry: CurrentWeatherEntry,
    val location: Location,
    val request: CurrentWeatherResponse
)