package cgmouse.javainaction.chap3;

import java.util.List;

import cgmouse.javainaction.util.Apple;
import cgmouse.javainaction.util.Util;

public class SortingApplesTestDrive {
    public static void main(String[] args) {
        List<Apple> inventory = Util.inventoryApples;

        inventory.sort(new AppleComparator());

        Util.printAppleList(inventory);
    }
    
}
