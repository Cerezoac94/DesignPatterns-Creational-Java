package com.midominio.creational.factorymethod2;

public class CreditCardPayment implements IPayment{
    @Override
    public void doPayment() {
        System.out.println("Pagando con tarjeta de Crédito");
    }
}
