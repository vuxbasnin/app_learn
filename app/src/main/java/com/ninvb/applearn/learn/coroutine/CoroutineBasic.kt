package com.ninvb.applearn.learn.coroutine

import com.ninvb.applearn.data.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Tranh su dung global scope ma nen su dung scope trong pham vi su dung: lifecycleScope, viewModelScope,...
 */

class CoroutineBasic {
    fun fetchAndShowUser() {
        GlobalScope.launch(Dispatchers.Main) {  //main thread
            val user = fetchUser() // I/O thread
            showUser(user)  //main thread
        }
    }

    suspend fun fetchUser(): User {
        return withContext(Dispatchers.IO) {    // I/O thread
            return@withContext (User("Nin", 25))    // I/O thread
        }
    }

    private fun showUser(user: User) {

    }
}