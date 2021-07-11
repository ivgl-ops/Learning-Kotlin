package com.example.myapplication


import com.google.gson.annotations.SerializedName

data class NowWeather(
    val results: List<Forecast>
)
data class Forecast(
    val day: Int,
    val temperature: String,
    val wind: String
)