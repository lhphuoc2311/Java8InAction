package cgmouse.javainaction.chap5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlattingStreamsAndMapTestDrive {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Hello", "World");// => return a list of all unique characters
        //=> H e l o W r d

        List<String[]> result = words.stream()//Stream<String>
            .map(word -> word.split(""))//Stream<String[]
            .distinct()
            .collect(java.util.stream.Collectors.toList());

        
        System.out.println(result);

        //Using Arrays.Stream()
        List<Stream<String>> result1 = words.stream()//Stream<String>
            .map(word -> word.split(""))//Stream<String[]>
            .map(Arrays::stream)//Stream<Stream<String>>
            .distinct()
            .collect(java.util.stream.Collectors.toList());

        System.out.println(result1);

        //Using flatMap
        List<String> uniqueCharacters = words.stream()//Stream<String>
            .map(word -> word.split(""))//Stream<String[]>
            .flatMap(Arrays::stream)//Stream<String>
            .distinct()
            .collect(java.util.stream.Collectors.toList());

        System.out.println(uniqueCharacters);




    }
    
}
