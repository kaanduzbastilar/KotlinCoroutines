package com.kaanduzbastilar.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
     //Dispatchers
     //Dispatchers.Default -> CPU Intensive (fotoğraf veya büyük diziler işlemciyi çok kullanan)
     //Dispatchers.IO -> InputOutput , Networking
     //Dispatchers.Main -> UI - Arayüz - defaultta yaptığın işlemi mainde gösterebilirsin
     //Dispatchers.Unconfined -> Inherited Dispatchers - Miras alan

     runBlocking {//diğer mainactivity de çalıştısaydık heryer main thread olduğu için çok anlamı olmuyordu
         //burda çalışmıyor maindeki herşeyi yorum yapıp orada çalıştır
         launch(Dispatchers.Main) {
             println("Main Thread : ${Thread.currentThread().name}")
         }
         launch(Dispatchers.IO) {
             println("IO Thread : ${Thread.currentThread().name}")
         }
         launch(Dispatchers.Default) {
             println("Default Thread : ${Thread.currentThread().name}")
         }
         launch(Dispatchers.Unconfined) {
             println("Unconfined  Thread : ${Thread.currentThread().name}")
         }
     }

 }