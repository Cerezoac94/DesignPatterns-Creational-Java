package com.midominio.creational.prototype;

public class Visa implements IPrototypeCard{
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCard() {
        System.out.println("Esto es una tarjeta visa");
    }

    @Override
    public IPrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Clonando tarjeta visa...");
        return (Visa) super.clone();
    }
}
