package com.midominio.creational.abstractfactory2.footers;

public class PurchaseOrderDocumentFooter implements IDocumentFooter{
    @Override
    public String footerText() {
        return "If you have any questions about this purchase orders, pleas contact";
    }

    public String contact(){
        String mail = "correo@contact.com";
        String web = "www.miwebcontact.com";
        return mail + "\n" + web;
    }
    @Override
    public String print(){
        return contact() + footerText();
    }
}
