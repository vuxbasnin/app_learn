package com.ninvb.applearn.learn.coroutine

/**
 * Dispatcher: giup Coroutine quyet dinh luong thuc hien cong viec
 *              - IO: network, file => download file, di chuyen file tren o dia, doc, viet file, make database query, load share preference
 *              - Default: cong viec dung nhieu CPU => sort, filter, bitmap,... big list
 *              - Main: UI thread Android => ort, filter, bitmap,... smaller list
 *              - Unconfined: Khong quan tam den coroutine chay o dau. Se bat dau va tiep tuc o tren thread da goi no
 */
class Dispatcher {
}