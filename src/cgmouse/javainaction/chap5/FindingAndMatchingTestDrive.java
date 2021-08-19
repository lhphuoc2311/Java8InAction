package cgmouse.javainaction.chap5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindingAndMatchingTestDrive {
    public static void main(String[] args) {
        
        //find oud whether the menu has a vegetarian
        if(Dish.menu.stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly !!");
        }



        //find out whether the menu is healthy (all dishes are below 1000 calories)
        boolean isHealthy = Dish.menu.stream()
                                    .allMatch(dish -> dish.getCalories() < 1000);

        System.out.println(isHealthy);

        //using terminal operation noneMatch method
        boolean isHealthy1 = Dish.menu.stream()
                                    .noneMatch(dish -> dish.getCalories() >= 1000);

        // find out an arbitary (tùy ý) element of the current stream
        // find a dish that is vegetarian
        Optional<Dish> dish = 
            Dish.menu.stream()
                     .filter(Dish::isVegetarian)
                     .findAny();//Return Optional<Dish>

        Dish.menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()//Return an Optional<Dish>
                .ifPresent(d -> System.out.println(d.getName()));

        //finds the first square that is divisible by 3

        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        someNumbers.stream()
                    .map(num -> num * num)//Stream<Integer * Integer>
                    .filter(num -> num % 3 == 0)//Stream<Integer>
                    .findFirst()//terminal operation => return Optional<Integer>
                    .ifPresent(num -> System.out.println(num));
    }
    
}
