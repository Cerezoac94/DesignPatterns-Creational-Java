package com.midominio.creational.prototype;

public interface IPrototypeCard extends Cloneable{
    void getCard();

    IPrototypeCard clone() throws CloneNotSupportedException;
}
