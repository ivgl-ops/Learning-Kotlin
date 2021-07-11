package com.example.justretrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.justretrofit.Post.Post
import com.example.justretrofit.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository:Repository):ViewModel() {
    val myResponce: MutableLiveData<Response<Post>> = MutableLiveData()
    fun getpost(){
        viewModelScope.launch {
            val responce = repository.getPost()
            myResponce.value = responce
        }
    }
}