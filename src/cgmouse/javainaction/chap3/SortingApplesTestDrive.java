package cgmouse.javainaction.chap3;

import java.util.Comparator;
import java.util.List;

import cgmouse.javainaction.util.Apple;
import cgmouse.javainaction.util.Util;

public class SortingApplesTestDrive {
    public static void main(String[] args) {
        List<Apple> inventory = Util.inventoryApples;

        inventory.sort(new Comparator<Apple>(){

            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
            
        });

        Util.printAppleList(inventory);
    }
    
}
