package cgmouse.javainaction.chap4;
import static cgmouse.javainaction.chap4.Dish.menu;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.function.Function;

public class FilteringLowCaloricDishesNameJ8TestDrive {
    public static void main(String[] args) {
        
        Function<Dish, Integer> function = dish -> dish.getCalories();
                                           //Dish::getCalories

        List<String> lowCaloricDishesName =
            menu.parallelStream()
            .filter(dish -> dish.getCalories() < 400)
            .sorted(comparing(Dish::getCalories))
            .map(Dish::getName)
            .collect(toList());

        for (String string : lowCaloricDishesName) {
            System.out.println(string);
        }



    }
    
}
