package com.midominio;


//import com.midominio.creational.singleton.Card;

import com.midominio.creational.singleton2.Card;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }

    private static void testPattern(){
        //singleton 1
//        Card.getINSTANCE().setCardNumber("0000 0000 0000 0000");
//        System.out.println(Card.getINSTANCE().getCardNumber());

        //singleton 2
        Card card = Card.getInstance("1111 1111 1111 1111");
        System.out.println(card.getCardNumber());

    }
}
