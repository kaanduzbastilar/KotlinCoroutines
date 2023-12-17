package com.kaanduzbastilar.kotlincoroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        delay(2000)
        println("run blocking")
        myFunc()
    }
}

suspend fun myFunc(){ //istediğimiz zman durdurabilen

    coroutineScope {
        delay(4000)
        println("suspend function")
    }

}