package com.example.kotlin_lesson_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private var number : Int = 0
    private var name: String = "Иван"
    var sum:Int = GetNum()
    private var text: String = "Привет, $name, ты наш $sum пользователь"
    private var Tvtext: TextView? = null
    private var Text1: TextView?  = null
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Tvtext = findViewById(R.id.TvText)
        var sum:Int = GetNum()
        Tvtext?.setText(text)

}
    private fun GetNum():Int
    {
        return 1
    }
}