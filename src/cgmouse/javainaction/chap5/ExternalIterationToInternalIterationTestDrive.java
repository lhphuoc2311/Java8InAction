package cgmouse.javainaction.chap5;

import java.util.ArrayList;
import java.util.List;


public class ExternalIterationToInternalIterationTestDrive {
    public static void main(String[] args) {
        
        //External iteration

        List<Dish> vegetarianDishes = new ArrayList<>();

        for(Dish dish: Dish.menu){
            if(dish.isVegetarian()){
                vegetarianDishes.add(dish);
            }
        }


        System.out.println(vegetarianDishes);

        //Internal iteration

        List<Dish> vegetarianDishInternalIteration = 
            Dish.menu.stream()
            .filter(Dish::isVegetarian)
            .collect(java.util.stream.Collectors.toList());

        System.out.println(vegetarianDishInternalIteration);
    }
    
}
