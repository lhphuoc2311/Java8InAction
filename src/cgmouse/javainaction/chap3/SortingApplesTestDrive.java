package cgmouse.javainaction.chap3;

import java.util.List;

import cgmouse.javainaction.util.Apple;
import cgmouse.javainaction.util.Util;
import static java.util.Comparator.comparing;

public class SortingApplesTestDrive {
    public static void main(String[] args) {
        List<Apple> inventory = Util.inventoryApples;

        inventory.sort(comparing((a) -> a.getWeight()));

        Util.printAppleList(inventory);
    }
    
}
