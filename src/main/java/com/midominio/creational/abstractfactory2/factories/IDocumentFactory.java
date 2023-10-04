package com.midominio.creational.abstractfactory2.factories;

import com.midominio.creational.abstractfactory2.footers.IDocumentFooter;
import com.midominio.creational.abstractfactory2.headers.IDocumentHeader;

public interface IDocumentFactory {
    IDocumentHeader createHeader();
    IDocumentFooter createFooter();
}
