package com.kaanduzbastilar.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    //job - döndürülen işleri sonradan kontrol edebiliyoruz
    //burayı değiştir iptal et vb

    runBlocking {
        val myJob = launch {
            delay(2000)
            println("job")
            val secondJob = launch {
                print("job 2")
            }

        }
        myJob.invokeOnCompletion {
            println("my job end")
        }
        myJob.cancel()
    }


}