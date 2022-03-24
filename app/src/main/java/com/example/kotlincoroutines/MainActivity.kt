package com.example.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
         //Light weightness -> Coroutineler, thread'lere göre çok daha verimlidir.Ne kadar fazla oluşturursanız oluşturun uygulama çökmez

        GlobalScope.launch {
            repeat(100000){
                println("android")
            }
        }
        */

        /*
        402-)Global Scope vs runBlocking
        Scope - kapsam -->Coroutinelerin nerede çalıştırılacağını belirleyen bir yapıdır.
        Bunun bir çok yapılma şekli vardır.

        1-)Global Scope = Bütün uygulama içerisinde çalıştırabileceğimiz bir kapsamda açıyor coroutine
        ->Çok karşımıza çıkan bir durum değil, genelde bir yerde veri çekilir uzun işlem yapılır vs.
        -> o yüzden çok kullanılmaz

        2-)Run Blocking = Bir scope oluşturuyor coroutinler için ve blokloyarak yapıyor.
        -> birden fazla işlem yaparken coroutine içindeki işlemler bitmeden diğer işlemleri başlatmıyor.
        ->Eğer ki yapacağımız kodda tek bir işlem yapıyorsak ve tek bir coroutine calıstaracak ısek yapıyoruz
        cunku dıger kodları bloklamak mantıklı değildir.

        3-)Coroutine scope = Yine scope olusturuyor ve ıcındekı coroutıneler bitene kadar çalışmaya devam ediyor.

         */

        /* -->Run Blocking

        Burada yukarıda println çalıştıktan sonra runblocking ile 7 sanıye delay koyduk ve delayın altındakı 2 println aynı anda calıstı

        println("run blocking started")
        runBlocking {
            launch {
                delay(7000)
                println("run Blocking")

            }
        }

        println("run blocking end")


         */

        //Burada ılk once globalscope started ve end yazdırıldı logcate ardından 5 sanıye sonra global scope yazdırıldı
        //runblocking ile farkı burada delay koyduktan sonra asagıdakı butun ıslemlerı bloklamıyor sadece kapsamın ıcındekı ıslemı
        // 5 sanıye kadar delaylıyor.

        /*
        println("global scope started")
        GlobalScope.launch {

            delay(5000)
            println("global scope")

        }

        println("global scope end")

         */

        //Coroutine scope vs Coroutine context
        //Scope coroute'nin nerde olacagını ve yonetımı ıle alakalı ıken context veriler ile birlikte çalışacağını söylüyor.
        //Farklı threadlerde calısmak, farklı seneryalor gelıstırmek bu tanımların altında
        //örn :
        /*println("start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")
        }

        println("end")

         */


        //runBlocking {

            //launch(Dispatchers.Main) {
                //println("Main Thread: ${Thread.currentThread().name}")
            }

           // launch(Dispatchers.IO) {
               // println("IO Thread: ${Thread.currentThread().name}")
            }

           // launch(Dispatchers.Default) {
                //println("Default Thread: ${Thread.currentThread().name}")
            //}

          //  launch(Dispatchers.Unconfined) {
              //  println("Unconfined Thread: ${Thread.currentThread().name}")
           // }
      //  }

  //  }





//}