package com.midominio.creational.abstractfactory2.footers;

public class InvoiceDocumentFooter implements IDocumentFooter{

    @Override
    public String footerText() {
        return "Esta es una representación impresa de un CFDI";
    }

    public String taxData(){
        return "Datos fiscales";
    }

    public String pageNumbers(){
        return "Page: " + "1/2";
    }
    @Override
    public String print(){
        return taxData() + "\n" + footerText()  + pageNumbers();
    }
}
