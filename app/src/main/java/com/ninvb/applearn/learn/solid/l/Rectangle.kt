package com.ninvb.applearn.learn.solid.l

/**
 * hinh nhu nhat
 */

open class Rectangle {
    var height = 0
    var weight = 0

    open fun area(height: Int, weight: Int): Int {
        return height * weight
    }
}