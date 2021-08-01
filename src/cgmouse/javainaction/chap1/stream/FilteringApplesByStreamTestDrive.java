package cgmouse.javainaction.chap1.stream;

import java.util.stream.Stream;

import cgmouse.javainaction.util.Util;

public class FilteringApplesByStreamTestDrive {
    public static void main(String[] args) {

        //SEQUENTIALLY PROCESSING
        Util.printAppleList(FilteringApplesByStream.filterHeavyApples());

        Util.printAppleList(FilteringApplesByStream.filterGreenApples());

        //PARALLEL PROCESSING
        Util.printAppleList(FilteringApplesByStream.filterRedApplesByParallelProcess());

        Stream stream;
    }
    
}
