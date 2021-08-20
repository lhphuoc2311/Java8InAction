package cgmouse.javainaction.chap7;

import java.util.stream.Stream;

public class ParallelSummingTestDrive {


    public static void main(String[] args) {
        long sum = parallelSum(1000);
        System.out.println(sum);
    }


    public static long parallelSum(long n){
        return Stream.iterate(1L, num -> num + 1)
                    .limit(n)
                    .parallel()
                    .reduce(0L, Long::sum);
    }
    
}
