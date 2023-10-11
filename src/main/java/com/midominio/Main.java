package com.midominio;


//import com.midominio.creational.prototype.IPrototypeCard;
//import com.midominio.creational.prototype.PrototypeFactory;
//import static com.midominio.creational.prototype.PrototypeFactory.CardType.AMEX;
//import static com.midominio.creational.prototype.PrototypeFactory.CardType.VISA;

import com.midominio.creational.prototype2.Amex;
import com.midominio.creational.prototype2.Visa;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }

    private static void testPattern(){
//        PrototypeFactory.loadCard();
//        try {
//            IPrototypeCard visa = PrototypeFactory.getInstance(VISA);
//            visa.getCard();
//            IPrototypeCard amex = PrototypeFactory.getInstance(AMEX);
//            amex.getCard();
//        } catch (CloneNotSupportedException ex){
//            ex.printStackTrace();
//        }

        //prototype 2
        Visa visa = new Visa();
        visa.setName("Esta es una tarjeta Visa");
        visa.getCard();
        Visa visa2 = (Visa) visa.clone();
        visa2.getCard();
        visa.getName();

        Amex amex = new Amex();
        amex.setName("Esta es una tarjeta American Express");
        Amex amex2 = (Amex) amex.clone();
        amex2.getCard();
        amex2.getName();
    }
}
