package ivangladko.weatherapp.ui.weather.current

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ivangladko.weatherapp.R
import ivangladko.weatherapp.data.ApixuwaetherApiService
import ivangladko.weatherapp.data.response.CurrentWeatherResponse
import kotlinx.android.synthetic.main.current_weather_fragment.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CurrentWeatherFragment : Fragment() {

    companion object {
        fun newInstance() = CurrentWeatherFragment()
    }

    private lateinit var viewModel: CurrentWeatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.current_weather_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CurrentWeatherViewModel::class.java)
        // TODO: Use the ViewModel
        val apiService = ApixuwaetherApiService()

        GlobalScope.launch(Dispatchers.Main) {
            val currentWeatherResponse = apiService?.getCurrentWeather("London")?.await()
            if (currentWeatherResponse != null) {
                textView.text = currentWeatherResponse.currentWeatherEntry.toString()
            }
        }
    }
}