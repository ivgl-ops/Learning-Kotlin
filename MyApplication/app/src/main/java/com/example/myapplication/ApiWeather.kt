package com.example.myapplication


import retrofit2.Call
import retrofit2.http.GET

interface ApiWeather {
    @GET("weather/Moscow")
    fun getWeather(): Call<NowWeather>
}