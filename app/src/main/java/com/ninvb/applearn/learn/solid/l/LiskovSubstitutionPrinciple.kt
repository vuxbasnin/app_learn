package com.ninvb.applearn.learn.solid.l

/***
 * Trong mot chuong trinh, cac object cua class con co the thay the class cha ma khong lam thay doi
 * tinh dung dan cua chuong trinh
 */
class LiskovSubstitutionPrinciple {
    fun calculate(height: Int, weight: Int) {
        val rectangle = Rectangle()
        val square = Square()
        rectangle.area(height, weight)
        //cho nay tinh dien tich se sai, vi pham quy tac LSP cua SOLID
        square.area(height, weight)
    }
}