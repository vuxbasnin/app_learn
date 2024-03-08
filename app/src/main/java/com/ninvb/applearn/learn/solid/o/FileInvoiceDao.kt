package com.ninvb.applearn.learn.solid.o

import com.ninvb.applearn.learn.solid.s.Invoice

class FileInvoiceDao : InterfaceInvoiceDao {
    override fun save(invoice: Invoice) {
        //save to file
    }
}