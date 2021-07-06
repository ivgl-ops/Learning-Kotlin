package ivangladko.weatherapp.data

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import ivangladko.weatherapp.data.response.CurrentWeatherResponse
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "f110b4a9cfaf2a74d2d265854af83d48"
interface ApixuwaetherApiService {
    @GET("current.json")
    fun getCurrentWeather(
            @Query("q") location: String,
            @Query("lang") langueCode: String = "en"
    ) : Deferred<CurrentWeatherResponse>

    companion object{
        operator fun invoke(): ApixuwaetherApiService? {
            val requestInterceptor = Interceptor{ chain ->
                val url = chain.request()
                        .url()
                        .newBuilder()
                        .addQueryParameter("key", API_KEY)
                        .build()
                val request = chain.request().newBuilder().url(url).build()

                return@Interceptor chain.proceed(request)
            }
            val okHttpClient = OkHttpClient.Builder().addInterceptor(requestInterceptor ).build()
            return Retrofit.Builder().client(okHttpClient).baseUrl("https://api.apixu.com/v1/")
                    .addCallAdapterFactory(CoroutineCallAdapterFactory())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApixuwaetherApiService::class.java)
        }
    }
}