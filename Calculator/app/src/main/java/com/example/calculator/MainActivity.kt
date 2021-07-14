package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var txt: TextView
        @SuppressLint("ShowToast")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            txt = findViewById(R.id.cal_text)
            main()

        }
            fun onNum(view: View) {
                txt.append((view as Button).text)
            }

            fun onOperator(view: View) {
                txt.append((view as Button).text)
            }

            fun onDot(view: View) {
                txt.append((view as Button).text)
            }

            fun onDel(view: View) {
                this.txt.text = ""
            }

            fun onE(view: View) {
                val text = txt.text.toString() //to string
                val eval = ExpressionBuilder(text).build()
                val res = eval.evaluate()
                txt.text = res.toString()
            }

            @SuppressLint("ShowToast")
            suspend fun FunnyerMessage(delay: Long) {
                delay(timeMillis = delay)
                val text = "Пора покормить кота!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }

            fun main() = runBlocking {
                joinAll(
                    async {
                        FunnyerMessage(100)
                    }
                )
            }

}