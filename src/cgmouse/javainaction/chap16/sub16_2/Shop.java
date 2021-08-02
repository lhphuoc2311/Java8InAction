package cgmouse.javainaction.chap16.sub16_2;
/* the best-price-finder application*/

import java.util.Random;

import cgmouse.javainaction.util.Util;

public class Shop {
    private final String name;
    private final Random random;

    

    public Shop(String name, Random random) {
        this.name = name;
        this.random = new Random(name.charAt(0) * name.charAt(1) * name.charAt(2));
    }



    public double getPrice(String product){
        return calculatePrice(product);
    }

    private double calculatePrice(String product){
        Util.delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }
    
}
