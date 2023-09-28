package com.midominio.creational.factorymethod2;

public class GooglePaymentFactory extends PaymentFactory{
    @Override
    public IPayment buildPayment() {
        return new GooglePayment();
    }
}
