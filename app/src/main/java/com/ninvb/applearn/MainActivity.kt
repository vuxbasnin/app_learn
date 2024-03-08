package com.ninvb.applearn

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.ninvb.applearn.my_interface.DemoInterface
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import timber.log.Timber

class MainActivity : ComponentActivity() {
    val TAG = this::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main()
    }

    fun main() {
        sendMessage()
    }
    // Concurrently executes both sections
    suspend fun doWorld() = coroutineScope { // this: CoroutineScope
        launch {
            delay(2000L)
            println("World 2")
        }
        launch {
            delay(1000L)
            println("World 1")
        }
        println("Hello")
    }

    suspend fun repeat() = coroutineScope {
        repeat(100) {
            launch {
                delay(3000L)
                println("NIN DEP TRAI")
            }
        }
    }

    fun sendMessage() {
        val user = User()
        user.sendMessage(SendMessageSms("Message sms"))
        user.sendMessage(SendMessageEmail("Message email"))
    }
}