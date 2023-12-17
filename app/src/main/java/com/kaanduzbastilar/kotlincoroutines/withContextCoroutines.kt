package com.kaanduzbastilar.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main(){//dispatch

    runBlocking {
        launch(Dispatchers.Default) {
            println("Context : ${coroutineContext}")
            withContext(Dispatchers.IO){
                println("Context : ${coroutineContext}") //main diye çalıştırsaydık göremezdik kotlin dosyasında dispatcher yok çünkü şuan
            }
        }
    }

}