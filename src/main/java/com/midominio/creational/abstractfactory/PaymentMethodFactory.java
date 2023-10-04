package com.midominio.creational.abstractfactory;

public class PaymentMethodFactory implements IAbstractFactory<IPaymentMethod>{
    @Override
    public IPaymentMethod create(String type) {
        if("CREDIT".equals(type)){
            return new Credit();
        }else if("DEBIT".equals(type)){
            return new Debit();
        }
        return null;
    }
}
