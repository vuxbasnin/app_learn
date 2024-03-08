package com.ninvb.applearn

import com.ninvb.applearn.my_interface.ISendMessage

class User {
    fun sendMessage(iSendMessage: ISendMessage){
        iSendMessage.sendMessage()
    }
}