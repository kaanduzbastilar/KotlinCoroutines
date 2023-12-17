package com.kaanduzbastilar.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness
        /*
        GlobalScope.launch {
            repeat(100000){
                launch {

                }
            }
        }

         */

        //Scope
        //Global Scope, runBlocking, CoroutineScope

        //runBlocking
        /*
        println("runBlocking start")
        runBlocking {
            launch {
                delay(5000)
                println("runBlocking")
            }
        }
        println("runBlocking end")

         */

        //GlobalScope - tüm application da çalışır
        /*
        println("GlobalScope start")
        GlobalScope.launch {
            delay(5000)
            println("GlobalScope")
        }
        println("GlobalScope end")

         */

        println("Coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {//hangi threadte çalışacağını biz seçiyoruz
            delay(5000)
            println("Coroutine scope")
        }
        println("Coroutine scope end")



    }
}