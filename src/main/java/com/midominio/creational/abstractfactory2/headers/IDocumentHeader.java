package com.midominio.creational.abstractfactory2.headers;

import java.time.LocalDate;

public interface IDocumentHeader {
    String title();

    String companyName();

    String logotypesUrl();

    LocalDate date();

    String print();
}
