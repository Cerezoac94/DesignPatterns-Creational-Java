package com.midominio.creational.singleton2;

public final class Card {
    //Volatile garantiza la visibilidad y sincronización de variables
    // entre múltiples subprocesos, lo que significa que las variables
    // declaradas como volatile se acceden directamente en la memoria principal
    // en lugar de mantenerse en caché en memoria local.
    private static volatile Card INSTANCE;

    private String cardNumber;

    private Card(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public static Card getInstance(String cardNumber){
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized(Card.class) {
            if (INSTANCE == null) {
                INSTANCE = new Card(cardNumber);
            }
            return INSTANCE;
        }
    }

    public String getCardNumber() {
        return this.cardNumber;
    }
}
