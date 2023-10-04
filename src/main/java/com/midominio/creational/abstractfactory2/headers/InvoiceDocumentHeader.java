package com.midominio.creational.abstractfactory2.headers;

import java.time.LocalDate;
import java.util.Date;

public class InvoiceDocumentHeader implements IDocumentHeader{
    private static int invoiceNumber;
    @Override
    public String title() {
        return "Factura Electrónica (CFDI)";
    }

    @Override
    public String companyName() {
        String name = "Mi compañía S.A de C.V";
        String rfc = "AAA00000AA00";
        String address = "Mi direccion, #0000, Estado, C.P. 00000";
        String telephone = "81818181";

        return name + "\n" + rfc + "\n" + address + "\n" + telephone;
    }

    @Override
    public String logotypesUrl() {
        return "mi-imagen-url.com";
    }

    @Override
    public LocalDate date() {
        return LocalDate.now();
    }

    public String invoiceNumber(){
        ++invoiceNumber;
        return "No. Factura:" + invoiceNumber;
    }

    @Override
    public String print(){
        return title() + "\n" + companyName() + logotypesUrl() + date() + "\n" +invoiceNumber();
    }
}
