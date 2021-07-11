package com.example.justretrofit.Post

import com.google.gson.annotations.SerializedName

data class Post(
    val id: Int,
    val title: String,
    val body: String
)