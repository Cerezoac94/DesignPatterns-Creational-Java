package com.midominio.creational.abstractfactory;

public class Debit implements IPaymentMethod{
    @Override
    public String doPayment() {
        return "Pago a Débito";
    }
}
