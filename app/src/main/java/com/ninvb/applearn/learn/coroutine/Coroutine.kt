package com.ninvb.applearn.learn.coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

/**
 * Coroutine la nhung thread nhe: khong anh xa len thread goc => khong yeu cau chuyen doi context tren luong goc => nhanh hon
 * Coroutine duoc quan ly boi nguoi dung. Thread quan ly boi he thong
 *
 * Suspend:
 *          - la mot function co the started, paused, resume
 *          - chi duoc goi trong mot coroutine hoac mot suspend function khac
 *
 * Co 2 cach start 1 coroutine:
 *          - launch:   + tra ve 1 job va khong mang bat ky ket qua tra ve nao(fire and forget)
 *                      + ung dung bi treo neu khong xu ly exception
 *
 *          - async:    + tra ve 1 instance Deferred<T> va ham await() tra ve ket qua cua Coroutine
 *                      + Exception luu tru trong Deferred va khong duoc gui di bat ky dau. No se bi loai bo tru khi xu ly.
 *
 */

class Coroutine {

    //Example launch
    val launchCoroutine = GlobalScope.launch(Dispatchers.IO) {
        //do some thing and do not return result
    }

    //Example async
    private val asyncCoroutine = GlobalScope.async(Dispatchers.IO) {
        return@async 10
    }

    suspend fun getResult(): Int {
        return asyncCoroutine.await()   //return 10
    }
}