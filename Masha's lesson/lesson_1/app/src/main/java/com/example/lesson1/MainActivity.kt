package com.example.lesson1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView
import java.lang.Math.sqrt
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x = 9
        if (x>10){
            x=x*1000
            println(x)
        }
        else {
            x=x-1000
            println(x)
        }


}}