package com.midominio.creational.abstractfactory;

public class FactoryProvider {
    public static IAbstractFactory getFactory(String chooseFactory){
        if("Card".equals(chooseFactory)){
            return new CardFactory();
        }else if("PaymentMethod".equals(chooseFactory)) {
            return new PaymentMethodFactory();
        }
        return null;
    }
}
