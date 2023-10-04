package com.midominio;


import com.midominio.creational.abstractfactory.FactoryProvider;
import com.midominio.creational.abstractfactory.IAbstractFactory;
import com.midominio.creational.abstractfactory.ICard;
import com.midominio.creational.abstractfactory.IPaymentMethod;
import com.midominio.creational.abstractfactory2.app.Application;
import com.midominio.creational.abstractfactory2.factories.IDocumentFactory;
import com.midominio.creational.abstractfactory2.factories.InvoiceDocumentFactory;
import com.midominio.creational.abstractfactory2.factories.PurchaseOrderDocumentFactory;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }

    private static void testPattern(){
//        IAbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
//        ICard card = (ICard) abstractFactory.create("VISA");
//        IAbstractFactory abstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
//        IPaymentMethod paymentMethod = (IPaymentMethod) abstractFactory1.create("DEBIT");
//        //if card or paymentMethod != null...
//        System.out.println("Una tarjeta de tipo: " + card.getCardType() + " Con método de pago: " + paymentMethod.doPayment());

        //abstractFactory2
        String type = "Invoice"; //param / enum
        Application app;
        IDocumentFactory factory;
        if ("Invoice".equals(type)) {
            factory = new InvoiceDocumentFactory();
        } else {
            factory = new PurchaseOrderDocumentFactory();
        }
        app = new Application(factory);

        app.print();

    }
}
