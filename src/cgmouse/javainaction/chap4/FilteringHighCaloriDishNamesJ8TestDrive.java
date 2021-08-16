package cgmouse.javainaction.chap4;

import java.util.List;

import static cgmouse.javainaction.chap4.Dish.menu;;

public class FilteringHighCaloriDishNamesJ8TestDrive {

    public static void main(String[] args) {
        List<String> threeHighCaloricDishNames = 
        menu.stream()
        .filter(dish -> {
            System.out.println("filtering:" + dish.getName());
            return dish.getCalories() > 300;
        })
        .map(dish ->{
            System.out.println("mapping: " + dish.getName());
            return dish.getName();
        })
        .limit(3)
        .collect(java.util.stream.Collectors.toList());

        System.out.println(threeHighCaloricDishNames);

    }
    
}
