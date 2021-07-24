package cgmouse.javainaction.chap1.passcode;
import java.util.List;
import cgmouse.javainaction.util.Apple;
import cgmouse.javainaction.util.Corlor;
import cgmouse.javainaction.util.Util;

public class FilteringApplesTestDriveJava8 {
    public static void main(String[] args) {
        List<Apple> lApples = FilteringApplesJava8
        .filterApples(Util.inventoryApples, FilteringApplesJava8::isGreenApple);
        Util.printAppleList(lApples);

        List<Apple> applesHeavyThan150 = FilteringApplesJava8
        .filterApples(Util.inventoryApples, FilteringApplesJava8::isHeavyApple);
        Util.printAppleList(applesHeavyThan150);

        //using lambdas syntax

        List<Apple> greApples = FilteringApplesJava8
        .filterApples(Util.inventoryApples, (Apple a) -> Corlor.RED.equals(a.getCorlor()));

        Util.printAppleList(greApples);

        //using library methods
        
    }
    
}
