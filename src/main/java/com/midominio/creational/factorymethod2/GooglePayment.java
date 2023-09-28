package com.midominio.creational.factorymethod2;

public class GooglePayment implements IPayment{
    @Override
    public void doPayment() {
        System.out.println("Pagando con Google Pay");
    }
}
