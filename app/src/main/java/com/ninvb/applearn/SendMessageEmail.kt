package com.ninvb.applearn

import android.util.Log
import com.ninvb.applearn.my_interface.ISendMessage

class SendMessageEmail(val messageEmail: String): ISendMessage {
    override fun sendMessage() {
        Log.d("NINVB99","NINVB99 => message email $messageEmail")
    }
}