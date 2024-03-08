package com.ninvb.applearn.learn.solid.o

import com.ninvb.applearn.learn.solid.s.Invoice
import com.ninvb.applearn.learn.solid.s.InvoiceDao

class DatabaseInvoiceDao : InterfaceInvoiceDao {
    override fun save(invoice: Invoice) {
        //save to database
    }
}