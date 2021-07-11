package com.example.justretrofit.repository

import com.example.justretrofit.Post.Post
import com.example.justretrofit.api.RetrofitInstance
import retrofit2.Response

class Repository {
    suspend fun  getPost(): Response<Post> {
       return RetrofitInstance.api.getDataApi()
    }
}