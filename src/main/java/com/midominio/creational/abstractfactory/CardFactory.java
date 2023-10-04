package com.midominio.creational.abstractfactory;

public class CardFactory implements IAbstractFactory<ICard>{
    @Override
    public ICard create(String type) {
        if("VISA".equals(type)){
            return new Visa();
        }else if("MASTERCARD".equals(type)){
            return new MasterCard();
        }
        return null;
    }
}
