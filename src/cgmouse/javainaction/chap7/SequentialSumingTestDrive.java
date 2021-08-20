package cgmouse.javainaction.chap7;

import java.util.stream.Stream;

public class SequentialSumingTestDrive {
    public static void main(String[] args) {
        long sum = sequentialSum(5);
        System.out.println(sum);
    }

    //using internal iterative stream
    public static long sequentialSum(long n) {
            return Stream.iterate(1L, num -> num + 1)
            .limit(n)
            .reduce(0L, Long::sum);
    }

    //the equivalent to its eterative counterpart (external iteration)
    public long iterativeSum(long n){
        long result = 0;
        for(long i = 1L; i <= n; i++){
            result += i;
        }
        return result;
    }

    

    
}
