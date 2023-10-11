package com.midominio.creational.prototype2;

public abstract class PrototypeCard {
    private String name;

    public PrototypeCard(){
    }

    public PrototypeCard(PrototypeCard target){
        if(target != null){
            this.name = target.name;
        }
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void getCard();
    public abstract PrototypeCard clone();
}
