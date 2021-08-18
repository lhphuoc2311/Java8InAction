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

        
        //return  [(1, 3), (1, 4), (2, 3), (2, 4),(3, 3), (3, 4)]

        //this is wrong
        List<int[]> pairs = 
            numbers1.stream()//Stream<Integer>
                .flatMap(num1 -> numbers2.stream()
                                    .map(num2 -> new int[]{num1, num2})
                    )//Stream<Stream<Integer[]>>
                
                .collect(java.util.stream.Collectors.toList());

        System.out.println(pairs);

        //return only pairs whose sum is divisible by 3
        List<int[]> divisibleBy3Pairs = 
            numbers1.stream()//Stream<Integer>
                .flatMap(num1 -> 
                            numbers2.stream()
                                .filter(num2 -> (num1 + num2) % 3 == 0)
                                .map(num2 -> new int[]{num1, num2})
                )//Stream<Stream<Integer[]>>
            
            .collect(java.util.stream.Collectors.toList());

    System.out.println(divisibleBy3Pairs);




    }
    
}
