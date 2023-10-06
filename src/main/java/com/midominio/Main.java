package com.midominio;

//import com.midominio.creational.builder.Card;
//import com.midominio.creational.builder2.builders.CardBuilder;
//import com.midominio.creational.builder2.director.Director;
import com.midominio.creational.builder3.builders.CardBuilder;
import com.midominio.creational.builder3.cards.Card;
import com.midominio.creational.builder3.cards.CardType;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }

    private static void testPattern(){
//       Card card = new Card.CardBuilder("VISA", "0000 1111 2222 3333")
//               .name("Jorge")
//               .expires(2030)
//               .credit(true)
//               .build();
//        System.out.println(card);
//
//        Card card2 = new Card.CardBuilder("AMEX", "9999 9999 9999 9999")
//                .build();
//        System.out.println(card2);

        //builder 2
//        Director director = new Director();
//        CardBuilder builder = new CardBuilder();
//        director.constructCard(builder, CardType.VISA, "0000 0000 0000 0000", "Jorge", 2030, false);
//        Card card = builder.getResult();
//
//        director.constructCard(builder, CardType.VISA, "0000 0000 0000 0001", "Antonio", 2030, true);
//        Card card2 = builder.getResult();
//        System.out.println(card);
//        System.out.println(card2);


//        builder 3
        Card card = new CardBuilder(CardType.VISA, "0000 0000 0000 0000")
                .name("José")
                .expires(2028)
                .credit(false)
                .build();
        System.out.println(card);
    }
}
