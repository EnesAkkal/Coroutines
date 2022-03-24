package com.example.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    /*

    403 -> İç içe Coroutines

    // ->Dispatchers

     Dispatcheri kullanırken coroutineler hangi treadlerde calıstracagımızı soyleyebılıyoruz ve karsımıza 4 farklı yapı cıktı.


       //Threadler
     1-)Default -> CPU Intensive (İşlemciyi çok kullanan bir işlem) ->Görsel işleme, cok uzun bir diziyi alfabetik dizmek.
     2-)IO   -> Input / Output == Networking işlemlerini burada yapıyoruz.Bir veritabanından veri almak gibi işlemleri burda yaptık.
     3-)Main --> Direkt UI'da yapıyoruz.Kullanıcının gorecegı ıslemlerı UI'da yapıyoruz direk.
     4-)Unconfined(Inheritated Dispatcher) -> Nerde oluşturulduğu ise inherit ediyor.


    runBlocking {

        launch(Dispatchers.Main) {
            println("Main Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Unconfined) {
            println("Unconfined Thread: ${Thread.currentThread().name}")
        }
    }

    Not:Burada launch'dan sonra "Dispatchers" kullanarak coroutine'nin nerede ne zaman calısacagını belırlıyebılıyoruz.

    */
}