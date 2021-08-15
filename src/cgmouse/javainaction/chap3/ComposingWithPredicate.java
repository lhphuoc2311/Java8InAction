package cgmouse.javainaction.chap3;

import java.util.List;
import java.util.function.Predicate;

import cgmouse.javainaction.chap1.passcode.FilteringApplesJava8;
import cgmouse.javainaction.util.Apple;
import cgmouse.javainaction.util.Corlor;
import cgmouse.javainaction.util.Util;

public class ComposingWithPredicate {
    public static void main(String[] args) {

        Predicate<Apple> redApple = (a) -> a.getCorlor().equals(Corlor.RED);

        Predicate<Apple> notRedApple = redApple.negate();

       // Util.printAppleList(FilteringApplesJava8.filterApples(Util.inventoryApples, notRedApple));

        Predicate<Apple> readAndHeavy = redApple.and(Apple::isHeavyApple);

        //Util.printAppleList(FilteringApplesJava8.filterApples(Util.inventoryApples, readAndHeavy));


        Predicate<Apple> readAndHeavyAppleorGreen = 
            redApple.and((Apple a) -> a.getWeight() > 150)
            .or(apple -> apple.getCorlor().equals(Corlor.GREEN));
            
        Util.printAppleList(FilteringApplesJava8.filterApples(Util.inventoryApples, readAndHeavyAppleorGreen));
       // Predicate<Apple> greenApple = Apple::isGreenApple;


    }
    
}
