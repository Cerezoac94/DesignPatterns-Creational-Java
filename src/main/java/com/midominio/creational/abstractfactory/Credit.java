package com.midominio.creational.abstractfactory;

public class Credit implements IPaymentMethod{
    @Override
    public String doPayment() {
        return "Pago a Crédito";
    }
}
