package cgmouse.javainaction.chap3;

import java.util.Comparator;
import java.util.List;

import cgmouse.javainaction.util.Apple;
import cgmouse.javainaction.util.Util;

public class SortingApplesTestDrive {
    public static void main(String[] args) {
        List<Apple> inventory = Util.inventoryApples;

        Comparator<Apple> c = Comparator.comparing((a) -> a.getWeight());

        inventory.sort(c);

        Util.printAppleList(inventory);
    }
    
}
