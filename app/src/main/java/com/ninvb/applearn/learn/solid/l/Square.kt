package com.ninvb.applearn.learn.solid.l

/**
 * Hinh vuong la hinh chu nhat co 2 canh bang nhau
 */

class Square : Rectangle() {
    fun setHeight(height: Int) {
        this.height = height
        this.weight = height
    }

    fun setWeight(weight: Int) {
        this.weight = weight
        this.height = weight
    }
}