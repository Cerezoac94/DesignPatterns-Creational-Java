package com.midominio.creational.builder3.builders;


import com.midominio.creational.builder3.cards.Card;
import com.midominio.creational.builder3.cards.CardType;

public class CardBuilder {
    private CardType cardType;
    private String number;
    private String name;
    private int expires;
    private boolean credit;

//    public CardBuilder cardType(CardType cardType) {
//        this.cardType = cardType;
//        return this;
//    }
//
//    public CardBuilder number(String number) {
//        this.number = number;
//        return this;
//    }

    public CardBuilder(CardType cardType, String number){
        this.cardType = cardType;
        this.number = number;
    }

    public CardBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CardBuilder expires(int expires) {
        this.expires = expires;
        return this;
    }

    public CardBuilder credit(boolean credit) {
        this.credit = credit;
        return this;
    }

    public Card build(){
        return new Card(cardType, number, name, expires, credit);
    }
}
