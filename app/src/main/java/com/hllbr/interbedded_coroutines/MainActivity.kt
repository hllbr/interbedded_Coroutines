package com.hllbr.interbedded_coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*
        Context nerede çalıştırıldığı  ve verilerle ilgisi scope coroutinesleri oluşturuyor ve yönetiyor.
        Context ise hangi verilerle çalışacağını ifade ediyor.
        Burada verilerle çalışmak derken varklı threadler ile çalışmak farklı işlemlere farklı senaryolar geliştirmek
        alt satır bir coroutineScope örneği
         */
        println("coroutineScope Start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutineScope")
        }
        //yapı globalScope gibi çalışıyor fakat tüm appte değil hangi threadler ile çalışacağını biz belirliyoruz .
        println("CoroutineScope End")
    }
}