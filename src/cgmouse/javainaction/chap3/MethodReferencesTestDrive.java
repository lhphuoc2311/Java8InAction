package cgmouse.javainaction.chap3;

import java.util.List;

import cgmouse.javainaction.util.Apple;
import cgmouse.javainaction.util.Util;

public class MethodReferencesTestDrive {
    public static void main(String[] args) {

        List<Apple> inventory = Util.inventoryApples;
        // Using lambda expression
        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));

        inventory.sort(java.util.Comparator.comparing(apple -> apple.getWeight()));
    }

}
