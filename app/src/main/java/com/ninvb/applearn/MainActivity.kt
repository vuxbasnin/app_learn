package com.ninvb.applearn

import android.os.Bundle
import androidx.activity.ComponentActivity
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
        bind()
    }

    fun bind() {

    }

    //D in SOLID principle
    fun sendMessage() {
        val user = User()
        user.sendMessage(SendMessageSms("Message sms"))
        user.sendMessage(SendMessageEmail("Message email"))
    }
}