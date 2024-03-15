package com.ninvb.applearn.learn.solid.l

/**
 * hinh nhu nhat
 */

open class Rectangle {
    private var height = 0
    private var weight = 0

    open fun area(): Int {
        return height * weight
    }

    open fun setHeight(height: Int){
        this.height = height
    }

    open fun setWeight(weight: Int){
        this.weight = weight
    }
}