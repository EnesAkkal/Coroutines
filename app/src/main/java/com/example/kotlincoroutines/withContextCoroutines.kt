package com.example.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

/*

    408 - withContext

    Bir launcherım ve bu dispatcher ile çalışıyor.Asagıda default'da bır ıslem yapacagız ve sonra baska bır yere gececegız.

    aynı launch ıcerısınde baska threadlerde ıslem yapabılıyoruz bu sekılde.


 */



    fun main() {

        runBlocking {

            launch(Dispatchers.Default) {
                println("Context: ${coroutineContext}")
                withContext(Dispatchers.IO) {
                    println("Context: ${coroutineContext}")

                }
            }

        }

    }