package ivangladko.weatherapp.data

import retrofit2.http.GET

const val API_KEY = "f110b4a9cfaf2a74d2d265854af83d48"
interface ApixuwaetherApiService {
    @GET("current.json")
    fun getCurrentWeather()
}