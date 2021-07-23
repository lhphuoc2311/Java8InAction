package cgmouse.javainaction.chap1.passcode;

import java.util.ArrayList;
import java.util.List;

import cgmouse.javainaction.util.Apple;
import cgmouse.javainaction.util.Corlor;

public class FilteringApplseJava8 {

    public static boolean isGreenApple(Apple apple){
        return Corlor.GREEN.equals(apple.getCorlor());
    }

    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight() > 150;
    }
    
    public static List<Apple> filterApplesJava8(List<Apple> apples, Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
