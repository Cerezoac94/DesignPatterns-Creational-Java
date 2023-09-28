package com.midominio.creational.factorymethod;

public class PaymentFactory {
    public static IPayment buildPayment(TypePayment typePayment){
        switch (typePayment){
            case CARD -> {
                return new CreditCardPayment();
            }
            case GOOGLEPAY -> {
                return new GooglePayment();
            }
            default -> {
                return new CreditCardPayment();
            }
        }
    }
}
