package com.example.weatherapp.model


import com.google.gson.annotations.SerializedName

data class Forecast(
    val day: Int,
    val temperature: String,
    val wind: String
)