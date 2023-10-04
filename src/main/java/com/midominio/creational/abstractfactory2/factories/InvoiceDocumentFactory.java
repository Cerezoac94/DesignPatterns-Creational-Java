package com.midominio.creational.abstractfactory2.factories;

import com.midominio.creational.abstractfactory2.footers.IDocumentFooter;
import com.midominio.creational.abstractfactory2.footers.InvoiceDocumentFooter;
import com.midominio.creational.abstractfactory2.headers.IDocumentHeader;
import com.midominio.creational.abstractfactory2.headers.InvoiceDocumentHeader;

public class InvoiceDocumentFactory implements IDocumentFactory{
    @Override
    public IDocumentHeader createHeader() {
        return new InvoiceDocumentHeader();
    }

    @Override
    public IDocumentFooter createFooter() {
        return new InvoiceDocumentFooter();
    }
}
