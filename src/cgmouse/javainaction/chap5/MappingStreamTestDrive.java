package cgmouse.javainaction.chap5;

import java.util.Arrays;
import java.util.List;

public class MappingStreamTestDrive {

    public static void main(String[] args) {
        //Extracting names of the dishes in the stream
        List<String> dishNames = 
            Dish.menu.stream()
                .map(Dish::getName)
                .collect(java.util.stream.Collectors.toList());
        System.out.println(dishNames);

        //returning a list of the number of characters for each word from a given list of word

        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");

        List<Integer> wordLengths =
            words.stream()
            .map(word -> word.length())
            .collect(java.util.stream.Collectors.toList());

        System.out.println(wordLengths);

        //extracting names of the dishes and then extract the length of the name of each dish
        List<Integer> dishNameLengths = Dish.menu.stream()
            .map(Dish::getName)
            .map(String::length)
            .collect(java.util.stream.Collectors.toList());
            
        System.out.println(dishNameLengths);
    }
    
}
