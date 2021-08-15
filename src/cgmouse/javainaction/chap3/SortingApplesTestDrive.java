package cgmouse.javainaction.chap3;

import java.util.Comparator;
import java.util.List;

import cgmouse.javainaction.util.Apple;
import cgmouse.javainaction.util.Util;

public class SortingApplesTestDrive {
    public static void main(String[] args) {
        List<Apple> inventory = Util.inventoryApples;

        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

        Util.printAppleList(inventory);
    }
    
}
