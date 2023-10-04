package com.midominio.creational.abstractfactory2.app;

import com.midominio.creational.abstractfactory2.factories.IDocumentFactory;
import com.midominio.creational.abstractfactory2.footers.IDocumentFooter;
import com.midominio.creational.abstractfactory2.headers.IDocumentHeader;

public class Application {
    private IDocumentHeader header;
    private IDocumentFooter footer;

    public Application(IDocumentFactory factory){
        header = factory.createHeader();
        footer = factory.createFooter();
    }

    public void print(){
        System.out.println(header.print());
        System.out.println("\n");
        System.out.println(footer.print());

    }
}
