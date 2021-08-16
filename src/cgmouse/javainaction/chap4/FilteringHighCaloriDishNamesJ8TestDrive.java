package cgmouse.javainaction.chap4;

import java.util.List;

import static cgmouse.javainaction.chap4.Dish.menu;;

public class FilteringHighCaloriDishNamesJ8TestDrive {

    public static void main(String[] args) {
        List<String> threeHighCaloricDishNames = 
        menu.stream()
        .filter(dish -> dish.getCalories() > 300)
        .map(Dish::getName)
        .limit(3)
        .collect(java.util.stream.Collectors.toList());

        System.out.println(threeHighCaloricDishNames);

    }
    
}
