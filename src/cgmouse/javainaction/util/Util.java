package cgmouse.javainaction.util;

import java.util.Arrays;
import java.util.List;

public class Util {

    public static List<Apple> inventoryApples = Arrays.asList(
        new Apple(90, Corlor.GREEN),
        new Apple(155, Corlor.GREEN),
        new Apple(120, Corlor.RED));

    public static void printAppleList(List<Apple> apples){

        for (Apple apple : apples) {
            System.out.println(apple.toString());
        }

    }

    public static void delay(){
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    
    


    
}
