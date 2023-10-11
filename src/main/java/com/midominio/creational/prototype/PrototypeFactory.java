package com.midominio.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import static com.midominio.creational.prototype.PrototypeFactory.CardType.AMEX;
import static com.midominio.creational.prototype.PrototypeFactory.CardType.VISA;

public class PrototypeFactory {
    public static class CardType{
        public static final String VISA = "visa";
        public static final String AMEX = "amex";
    }
    private static Map<String, IPrototypeCard> prototypesCards = new HashMap<>();

    public static IPrototypeCard getInstance(final String tipo) throws CloneNotSupportedException{
        return prototypesCards.get(tipo).clone();
    }

    public static void loadCard(){
        Visa visa = new Visa();
        visa.setName("Esta tarjeta es Visa con número 0000");
        prototypesCards.put(VISA, visa);

        Amex amex = new Amex();
        amex.setName("Esta tarjeta es Amex con número 0000");
        prototypesCards.put(AMEX, amex);
    }
}
