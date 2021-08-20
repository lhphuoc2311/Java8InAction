package cgmouse.javainaction.chap5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducingStreamTestDrive {
    public static void main(String[] args) {

        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);

        // Before using reduce method
        int sum = 0;
        for (Integer integer : someNumbers) {
            sum += integer;
        }

        System.out.println(sum);

        // Using reduce method over list of numbers to sum

        int sum2 = someNumbers.stream().reduce(0, Integer::sum);
        System.out.println(sum2);

        // using reduce method to multiply
        int multi = someNumbers.stream()
                                .reduce(1, (num1, num2) -> num1 * num2);

        System.out.println("Multiplying: " + multi);

        //Using reduce that doesn't take an inital value, return a Optional

        someNumbers.stream()
                    .reduce((num1, num2) -> (num1 + num2))//Optional<Integer>
                    .ifPresent(num -> System.out.println(num));
        
        //To compute maxima and minima
        Optional<Integer> max = 
            someNumbers.stream()
                        .reduce(Integer::max);
        System.out.println("Max: " + max.get());

        Optional<Integer> min = 
            someNumbers.stream()
                        .reduce((num1, num2) -> num1 < num2 ? num1 : num2);
        System.out.println("Min: " + min.get());


    }

}
