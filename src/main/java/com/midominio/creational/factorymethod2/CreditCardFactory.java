package com.midominio.creational.factorymethod2;

public class CreditCardFactory extends PaymentFactory{
    @Override
    public IPayment buildPayment() {
        return new CreditCardPayment();
    }
}
