package cgmouse.javainaction.util;

public class Apple {

    private Integer weight = 0;
    private Corlor corlor;
    private Country country;

    public Apple(int weight, Corlor corlor) {
        this.weight = weight;
        this.corlor = corlor;
    }

    

    public Apple(Integer weight, Corlor corlor, Country country) {
        this.weight = weight;
        this.corlor = corlor;
        this.country = country;
    }

    public static boolean isGreenApple(Apple apple){
        return Corlor.GREEN.equals(apple.getCorlor());
    }

    public static boolean isRedApple(Apple apple){
        return Corlor.RED.equals(apple.getCorlor());
    }

    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight() > 150;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Corlor getCorlor() {
        return corlor;
    }

    public void setCorlor(Corlor corlor) {
        this.corlor = corlor;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Apple [corlor=" + corlor + ", weight=" + weight + ", country = " + country + "]";
    }

    

    
}
