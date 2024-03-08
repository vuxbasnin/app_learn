package com.ninvb.applearn.learn.solid.s

class Invoice(private val marker: Marker, private val quantity: Int) {
    fun calculateTotal(): Int {
        return marker.price*quantity
    }
}