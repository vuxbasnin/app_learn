package com.ninvb.applearn.learn.solid.s

/***
 * A class should have only one reason to change
 * (Every class should have only one responsibility
 */
class SingleResponsibility {
    //write 3 class other to handle: calculate, print, save
    val data = Marker("Nin", "White", 1000)
    val invoice = Invoice(data, 10)
    val totalInvoice = invoice.calculateTotal()
    val saveToDb = InvoiceDao(invoice).saveToDb()
    val printInvoice = InvoicePrinter(invoice).printInvoice()
}