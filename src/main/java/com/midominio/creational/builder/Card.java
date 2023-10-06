package com.midominio.creational.builder;

public class Card {
    private final String cardType;
    private final String number;
    private final String name;
    private final int expires;
    private final boolean credit;

    private Card(CardBuilder builder){
        this.cardType = builder.cardType;
        this.number = builder.number;
        this.name = builder.name;
        this.expires = builder.expires;
        this.credit = builder.credit;
    }

    public String getCardType() {
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
    public static class CardBuilder{
        private String cardType;
        private String number;
        private String name;
        private int expires;
        private boolean credit;

        public CardBuilder(String cardType, String number){
            this.cardType = cardType;
            this.number = number;
        }

        public CardBuilder name(String name){
            this.name = name;
            return this;
        }

        public CardBuilder expires(int expires){
            this.expires = expires;
            return this;
        }
        public CardBuilder credit(boolean credit){
            this.credit = credit;
            return this;
        }
        public Card build(){
            return new Card(this);
        }
    }
}
