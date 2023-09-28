package com.midominio;

//import com.midominio.creational.factorymethod.CreditCardPayment;
//import com.midominio.creational.factorymethod.IPayment;
//import com.midominio.creational.factorymethod.PaymentFactory;
//import com.midominio.creational.factorymethod.TypePayment;
import com.midominio.creational.factorymethod2.CreditCardFactory;
import com.midominio.creational.factorymethod2.IPayment;
import com.midominio.creational.factorymethod2.PaymentFactory;

public class Main {
    public static void main(String[] args) {
        probarFactoryMethod();
    }

    //1 Factory Method
    private static void probarFactoryMethod(){
        //v1
        //IPayment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        //payment.doPayment();

        //v2
        PaymentFactory creditCardFactory = new CreditCardFactory();
        IPayment creditCardPayment = creditCardFactory.buildPayment();
        creditCardPayment.doPayment();
    }
}