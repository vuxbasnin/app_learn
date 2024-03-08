package com.ninvb.applearn.learn.solid.d

import com.ninvb.applearn.my_interface.ISendMessage

class User {
    fun sendMessage(iSendMessage: ISendMessage){
        iSendMessage.sendMessage()
    }
}