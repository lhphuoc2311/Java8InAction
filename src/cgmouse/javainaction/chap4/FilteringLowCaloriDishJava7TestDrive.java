package cgmouse.javainaction.chap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FilteringLowCaloriDishJava7TestDrive {

    public static void main(String[] args) {

        List<Dish> lowCaloricDishes = new ArrayList<>();

        for (Dish dish : Dish.menu) {
            if(dish.getCalories() < 400){
                lowCaloricDishes.add(dish);
            }
        }

        //lowCaloricDishes.sort((dish1, dish2) -> dish1.getCalories() - dish2.getCalories());

        Collections.sort(lowCaloricDishes, new Comparator<Dish>(){

            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
            
        });

        Dish.printDishList(lowCaloricDishes);

        List<String> lowCaloricDishesName = new ArrayList<>();
        for (String string : lowCaloricDishesName) {

            lowCaloricDishesName.add(string);
            
        }



        
    }


    
}
