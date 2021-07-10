package com.hllbr.interbedded_coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {

        launch {
            delay(5000)
            println("run bloking")
        }
        coroutineScope {
            launch {
            delay(3000)
            println("Coroutines_Scope")
        } }
    }

}