package com.example.learncoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        suspend fun coroutine(number: Int, delay: Long) {
            println("Coroutine $number starts work")
            delay(timeMillis = delay)
            println("Coroutine $number has finished")
        }
        suspend fun coroutineNew(number:Int, delay: Long){
            println("CoroutineNEW $number starts work")
            delay(timeMillis = delay + 132)
            println("CoroutineNEW $number has finished")
        }
        suspend fun threadSwitchingCoroutine(number: Int, delay: Long) {
            println("Coroutine $number starts work on ${Thread.currentThread().name}")
            delay(delay)
            withContext(Dispatchers.IO) {
                println("Coroutine $number has finished on ${Thread.currentThread().name}")
            }
        }

        fun main() = runBlocking {
            println("main starts")
            joinAll(
                    async { coroutine(1, 500) },
                    async {coroutineNew(2, 200)},
                    async {coroutineNew(3, 100)},
                    async { coroutine(4, 1300) },
                    async { coroutine(5, 1400) },
                    async { threadSwitchingCoroutine(1, 500) },
                    async { threadSwitchingCoroutine(2, 300) }

            )
            println("main ends")
        }
        main()

    }
}