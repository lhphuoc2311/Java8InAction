package cgmouse.javainaction.chap1.passcode;

import java.util.ArrayList;
import java.util.List;

import cgmouse.javainaction.util.Corlor;

public class FilteringApples {

    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(Corlor.GREEN.equals(apple.getCorlor())){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(apple.getWeight() > 150){
                result.add(apple);
            }
        }
        return result;
    }

    
}
