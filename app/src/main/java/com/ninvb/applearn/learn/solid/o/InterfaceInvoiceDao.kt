package com.ninvb.applearn.learn.solid.o

import com.ninvb.applearn.learn.solid.s.Invoice

interface InterfaceInvoiceDao {
    fun save(invoice: Invoice)
}