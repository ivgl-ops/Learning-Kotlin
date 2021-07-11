package com.example.justretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.justretrofit.repository.Repository

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val repository = Repository()
        val viewModelFac = MainViewModelFacroty(repository)
        val textView = findViewById<TextView>(R.id.textView)
        val textView1 = findViewById<TextView>(R.id.textView2)
        viewModel = ViewModelProvider(this, viewModelFac).get(MainViewModel::class.java)
        viewModel.getpost()
        viewModel.myResponce.observe(this, Observer { responce ->
            if(responce.isSuccessful){
                android.util.Log.d("Responce", responce.body()?.title.toString())
                textView.text = responce.body()?.title!!
            }else{
                Log.d("Respoce", responce.errorBody().toString())
                textView.text = responce.code().toString()
            }

        })
    }
}