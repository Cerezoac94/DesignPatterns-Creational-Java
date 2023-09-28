package com.midominio;

import com.midominio.creational.factorymethod.IPayment;
import com.midominio.creational.factorymethod.PaymentFactory;
import com.midominio.creational.factorymethod.TypePayment;

public class Main {
    public static void main(String[] args) {
        probarFactoryMethod();
    }

    //1 Factory Method
    private static void probarFactoryMethod(){
        IPayment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }
}