package cgmouse.javainaction.chap1.passcode;

import cgmouse.javainaction.util.Util;

public class FilteringApplesTestDrive {
    public static void main(String[] args) {

        Util.printAppleList(FilteringApples.filterGreenApples(Util.inventoryApples));
        
    }
    
}
