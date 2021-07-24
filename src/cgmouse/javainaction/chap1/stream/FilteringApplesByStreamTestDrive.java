package cgmouse.javainaction.chap1.stream;

import cgmouse.javainaction.util.Util;

public class FilteringApplesByStreamTestDrive {
    public static void main(String[] args) {
        Util.printAppleList(FilteringApplesByStream.filterHeavyApples());

        Util.printAppleList(FilteringApplesByStream.filterGreenApples());
    }
    
}
