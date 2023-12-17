package com.kaanduzbastilar.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    var userName = ""
    var userAge = 0

    runBlocking {

        val downloadedName = async {
            downloadName()
        }
        val downloadedAge = async {
            downloadAge()
        }

        userName  = downloadedName.await() //async return bekliyor .await ile alabiliyoruz
        userAge = downloadedAge.await()

        println("${userName} ${userAge}")

        /*
        launch {
            val downloadedName = downloadName()
            userName = downloadedName
        }
        launch {
            val downloadedAge = downloadAge()
            userAge = downloadedAge
        }

        println("${userName} ${userAge}") //böyle yazınca yazdırmaz hepsi farklı zamanlarda oluyor
         */



    }


}

suspend fun downloadName() : String{
    delay(2000)
    val userName = "kaan: "
    println("username download")
    return userName
}

suspend fun downloadAge() : Int{
    delay(4000)
    val userAge = 60
    println("userage download")
    return userAge
}