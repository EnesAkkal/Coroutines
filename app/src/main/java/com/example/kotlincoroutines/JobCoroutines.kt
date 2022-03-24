package com.example.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    /*
    407 - Job Coroutines

    launch calıstırdıgımız yerde bir job cıkabılıyor. yani launch calıstırdıgımız seylerı joba esıtlıyebılıyoruz.
    aslında bir job donduruyor. Bu dondurulen ıslerı bız sonradan kontrol edebılıoyoruz.

    aşağıda launch'ı myjob'a eşitledikden sonra yanı bır variable olusturduktan sonra işlemler bittikten sonra bize işin bittiği ile
    alakalı bılgı vermesını ısteyebılıyoruz veya myjob.cancel ile yukarıdaı 2 tane launch baslamadan ıptal edebılıyor ve
    sadece myjob end yazdırabiliyoruz.
     */

    runBlocking {

        val myjob = launch {
            delay(2000)
            println("job")
            val secondJob = launch {
                println("second job")
            }
        }

        myjob.invokeOnCompletion {
            println("my job end")
        }

     //   myjob.cancel()
    }
}