package com.ninvb.applearn

import android.util.Log
import com.ninvb.applearn.my_interface.ISendMessage

class SendMessageSms(val messageSms: String): ISendMessage {
    override fun sendMessage() {
        Log.d("NINVB99", "NINVB99 => message Sms $messageSms")
    }
}