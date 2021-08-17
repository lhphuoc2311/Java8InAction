package cgmouse.javainaction.chap5;

import java.util.Arrays;
import java.util.List;


public class SlicingStreamWithPredicateTestDrive {

    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT), new Dish("french fries", true, 530, Dish.Type.OTHER));

        // select the dishes that have fewer than 320 calories
        List<Dish> filteredMenu = specialMenu.stream().filter(dish -> dish.getCalories() < 320)
                .collect(java.util.stream.Collectors.toList());

        System.out.println(filteredMenu);

        //slicing menu

        List<Dish> slicedMenu1 = 
            specialMenu.stream()
            .takeWhile(dish -> dish.getCalories() < 320)
            .collect(java.util.stream.Collectors.toList());
        System.out.println("slicing: " + slicedMenu1);

        //print data by using forEach

        specialMenu.stream()
        .takeWhile(dish -> dish.getCalories() < 320)
        .forEach(dish -> System.out.println(dish.getName()));

        List<Dish> slicedMenu2 = 
                specialMenu.stream()
                .dropWhile(dish -> dish.getCalories() < 320)
                .collect(java.util.stream.Collectors.toList());
        System.out.println(slicedMenu2);

        
        


    }

}
