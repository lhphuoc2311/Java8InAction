package cgmouse.javainaction.chap5;

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
    }
    
}
