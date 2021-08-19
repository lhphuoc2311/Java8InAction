package cgmouse.javainaction.chap5;

public class FindingAndMatchingTestDrive {
    public static void main(String[] args) {
        
        //find oud whether the menu has a vegetarian
        if(Dish.menu.stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly !!");
        }
    }
    
}
