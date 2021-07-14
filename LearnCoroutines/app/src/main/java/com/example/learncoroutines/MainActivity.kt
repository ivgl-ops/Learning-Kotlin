package com.example.learncoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        suspend fun getValue(delay:Long){
            delay(timeMillis = delay)
            println("Your value is 5")
        }

        fun main() = runBlocking {
            joinAll(
                async { getValue(3000) }
            )
        }
        main()
        }

    }
