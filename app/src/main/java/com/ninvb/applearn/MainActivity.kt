package com.ninvb.applearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ninvb.applearn.learn.solid.d.SendMessageEmail
import com.ninvb.applearn.learn.solid.d.SendMessageSms
import com.ninvb.applearn.learn.solid.d.User
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    val TAG = this::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestCompose()
        }
    }

    fun bind() {
//        sendMessage()
    }

    //D in SOLID principle
    fun sendMessage() {
        val user = User()
        user.sendMessage(SendMessageSms("Message sms"))
        user.sendMessage(SendMessageEmail("Message email"))
    }

    //Jetpack compose
    @Composable
    fun TestCompose() {
        Text(text = "Hello world!")
    }
}