package com.midominio.creational.prototype2;

public class Visa extends PrototypeCard{

    public Visa(){}


    public Visa(Visa target){
        super(target);
    }

    @Override
    public void getCard() {
        System.out.println("Visa");
    }

    @Override
    public PrototypeCard clone() {
        System.out.println("Clonando tarjeta Visa...");
        return new Visa(this);
    }
}
