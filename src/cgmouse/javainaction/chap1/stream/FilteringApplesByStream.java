package cgmouse.javainaction.chap1.stream;

import java.util.List;
import static java.util.stream.Collectors.toList;
import cgmouse.javainaction.util.Apple;
import cgmouse.javainaction.util.Corlor;
import cgmouse.javainaction.util.Util;

public class FilteringApplesByStream {

    public static List<Apple> filterHeavyApples(){
        List<Apple> heavyApples;
        heavyApples = Util.inventoryApples.stream()
            .filter((Apple a) -> a.getWeight() > 150)
            .collect(toList());
        return heavyApples;
    }

    public static List<Apple> filterGreenApples(){
        List<Apple> greenApples;
        greenApples = Util.inventoryApples.stream()
            .filter((Apple a) -> a.getCorlor().equals(Corlor.GREEN))
            .collect(toList());
        return greenApples;
    }
    
}
