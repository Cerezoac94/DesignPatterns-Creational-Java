package com.midominio.creational.builder2.builders;


import com.midominio.creational.builder2.cards.Card;
import com.midominio.creational.builder2.cards.CardType;

public class CardBuilder implements IBuilder{
    private CardType cardType;
    private String number;
    private String name;
    private int expires;
    private boolean credit;

    @Override
    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setExpires(int expires) {
        this.expires = expires;
    }

    @Override
    public void setCredit(boolean credit) {
        this.credit = credit;
    }

    public Card getResult(){
        return new Card(cardType, number, name, expires, credit);
    }
}
