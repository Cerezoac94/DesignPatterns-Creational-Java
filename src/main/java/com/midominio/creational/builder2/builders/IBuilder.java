package com.midominio.creational.builder2.builders;

import com.midominio.creational.builder2.cards.CardType;

public interface IBuilder {
    void setCardType(CardType cardType);
    void setNumber(String number);
    void setName(String name);
    void setExpires(int expires);
    void setCredit(boolean credit);
}
