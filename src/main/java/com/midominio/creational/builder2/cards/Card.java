package com.midominio.creational.builder2.cards;

public class Card {
    private final CardType cardType;
    private final String number;
    private final String name;
    private final int expires;
    private final boolean credit;

    public Card(CardType cardType, String number, String name, int expires, boolean credit){
        this.cardType = cardType;
        this.number = number;
        this.name = name;
        this.expires = expires;
        this.credit = credit;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public String getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public int getExpires() {
        return this.expires;
    }

    public boolean isCredit() {
        return this.credit;
    }

    @Override
    public String toString(){
        return "Card: " + this.cardType + " " + this.number + " " + this.expires + " " + this.name + " Is credit: " + this.credit;
    }
}
