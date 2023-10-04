package com.midominio.creational.abstractfactory;

public class MasterCard implements ICard{
    @Override
    public String getCardType() {
        return "MASTERCARD";
    }

    @Override
    public String getCardNumber() {
        return "0000 0000 MAST CARD";
    }
}
