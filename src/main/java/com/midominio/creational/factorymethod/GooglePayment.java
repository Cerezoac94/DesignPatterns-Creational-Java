package com.midominio.creational.factorymethod;

public class GooglePayment implements IPayment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con Google Payment");
    }
}
