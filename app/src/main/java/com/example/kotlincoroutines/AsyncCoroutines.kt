package com.example.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    var userName = ""
    var userAge = 0

    /*
    406 - AsyncCoroutines

    örnegın ınternet'den 2 tane verı ındırıoyoruz bırısı kullanıcının adı dıgerı yaşı.Bunları ne zaman ındırecegımız bellı olmayabılır
    bunları aynı anda nasıl ındıreceğiz ? bunları async olarak kullanıyoruz.Async kullandıgımız zaman bızden bır cevap beklıyor.

    Async launch'a kıyaslarsak asynch bir return bekliyor.



    */

    runBlocking {

        val downloadedName = async {
            downloadName() // -> Return
        }

        val downloadedAge = async {
            downloadAge()
        }

        userName = downloadedName.await() //.await komutu yukarıdakı yaş ve kullanıcının adının inmesini bekliyor.Bu sekılde thread bloklanmıyor.
        userAge = downloadedAge.await()

        println("${userName} ${userAge}")

        }




    }






suspend fun downloadName() :String {
    delay(2000)
    val userName = "Atil"
    println("username download")
    return  userName
}

suspend fun downloadAge() : Int {
    delay(4000)
    val userAge = 60
    println("userage download")
    return userAge

}