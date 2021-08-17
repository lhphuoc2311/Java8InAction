package cgmouse.javainaction.chap5;

import java.util.List;

public class TruncatingStreamTestDrive {

    public static void main(String[] args) {

        //selecting the first three dishes that have more than 300 calories

        List<Dish> threeDishGT300Caloric =
            Dish.specialMenu.stream()
            .filter(dish -> dish.getCalories() > 300)
            .limit(2)
            .collect(java.util.stream.Collectors.toList());

        System.out.println(threeDishGT300Caloric);

        //skipping the first two dishes that have more than 300 calories

        Dish.specialMenu.stream()
            .filter(dish -> dish.getCalories() > 300)
            .skip(2)
            .forEach(dish -> System.out.println(dish.getName()));
        
    }
    
}
