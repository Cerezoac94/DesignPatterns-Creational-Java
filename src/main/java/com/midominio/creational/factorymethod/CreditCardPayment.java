package com.midominio.creational.factorymethod;

public class CreditCardPayment implements IPayment{

    @Override
    public void doPayment() {
        System.out.println("Pagando con tarjeta de Crédito");
    }
}
