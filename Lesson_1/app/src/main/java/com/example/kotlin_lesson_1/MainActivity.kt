package com.example.kotlin_lesson_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private var number : Int = 0
    private var text: String = "Привет"
    private var start: Boolean = false
    private var Tvtext: TextView? = null
    private var CLayout: ConstraintLayout? = null
    private var counter: Int = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Tvtext = findViewById(R.id.TvText)
        Tvtext?.setText("Текст поменялся")
        CLayout = findViewById(R.id.cLayout)
        Thread{
            start = true
            while(start){
                Thread.sleep( 1000)
                if (counter == 5)
                {
                   runOnUiThread {
                       CLayout?.setBackgroundColor(Color.CYAN)
                   }
            }
        }

    }.start()
}}