package com.midominio.creational.abstractfactory2.factories;

import com.midominio.creational.abstractfactory2.footers.IDocumentFooter;
import com.midominio.creational.abstractfactory2.footers.PurchaseOrderDocumentFooter;
import com.midominio.creational.abstractfactory2.headers.IDocumentHeader;
import com.midominio.creational.abstractfactory2.headers.PurchaseOrderDocumentHeader;

public class PurchaseOrderDocumentFactory implements IDocumentFactory{
    @Override
    public IDocumentHeader createHeader() {
        return new PurchaseOrderDocumentHeader();
    }

    @Override
    public IDocumentFooter createFooter() {
        return new PurchaseOrderDocumentFooter();
    }
}
