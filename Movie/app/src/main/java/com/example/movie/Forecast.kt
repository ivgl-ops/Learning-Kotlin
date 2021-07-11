package com.example.movie


import com.google.gson.annotations.SerializedName
data class PopularWeather(
        val results: List<Forecast>
)

data class Forecast(
    val day: Int,
    val temperature: String,
    val wind: String
)