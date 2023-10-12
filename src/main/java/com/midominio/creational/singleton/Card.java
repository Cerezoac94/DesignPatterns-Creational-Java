package com.midominio.creational.singleton;

public class Card {
    private static Card INSTANCE;
    private String cardNumber;

    private Card(){

    }

    //synchronized por si dos hilos entran al mismo tiempo, evitar se cree dos veces la instancia
    public synchronized static Card getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new Card();
        }
        return INSTANCE;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
