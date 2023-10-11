package com.midominio.creational.prototype2;

public class Amex extends PrototypeCard{
    public Amex(){}

    public Amex(Amex target){
        super(target);
    }


    @Override
    public void getCard() {
        System.out.println("American Express");
    }

    @Override
    public PrototypeCard clone() {
        System.out.println("Clonando tarjeta American Express...");
        return new Amex(this);
    }
}
