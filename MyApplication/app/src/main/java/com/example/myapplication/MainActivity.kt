package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val request = ServiceBuilder.buildService(ApiWeather::class.java)
        val text1 = findViewById<TextView>(R.id.textview)
        val call = request.getWeather()
        call.enqueue(object : Callback<NowWeather>{
            override fun onResponse(call: Call<NowWeather>, response: Response<NowWeather>) {
                        adapter = WeatherAdapter(response.body()!!.results)

            }
            override fun onFailure(call: Call<NowWeather>, t: Throwable) {
                Toast.makeText(this@MainActivity, "${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}