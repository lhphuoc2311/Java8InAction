package cgmouse.javainaction.chap5;

import java.util.Arrays;
import java.util.List;

public class MappingWithQuizTestDrive {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //return a list of the square for each number

        List<Integer> squareNumbers = numbers.stream()//Stream<Integer>
            .map(number -> number * number)//Stream<Integer*2>
            .collect(java.util.stream.Collectors.toList());
        System.out.println(squareNumbers);

        //given two lists of numbers
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

    }
    
}
