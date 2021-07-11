package com.example.justretrofit.api

import com.example.justretrofit.Post.Post
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("posts/1")
    suspend fun getDataApi() : Response<Post>
}