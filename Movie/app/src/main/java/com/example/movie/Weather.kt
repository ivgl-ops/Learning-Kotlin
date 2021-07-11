package com.example.movie


import com.google.gson.annotations.SerializedName

data class Weather(
    val description: String,
    val forecast: List<Forecast>,
    val temperature: String,
    val wind: String
)