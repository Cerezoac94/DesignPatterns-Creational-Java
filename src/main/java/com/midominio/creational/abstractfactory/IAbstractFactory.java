package com.midominio.creational.abstractfactory;

public interface IAbstractFactory<T> {
    T create(String type);
}
