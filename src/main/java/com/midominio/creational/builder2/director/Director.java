package com.midominio.creational.builder2.director;

import com.midominio.creational.builder2.builders.IBuilder;
import com.midominio.creational.builder2.cards.CardType;

public class Director {
    public void constructCard(IBuilder builder, CardType cardType, String number, String name, int expires, boolean credit){
        builder.setCardType(cardType);
        builder.setNumber(number);
        builder.setName(name);
        builder.setExpires(expires);
        builder.setCredit(credit);
    }

}
