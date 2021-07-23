package cgmouse.javainaction.util;

public class Apple {

    private int weight = 0;
    private Corlor corlor;

    public Apple(int weight, Corlor corlor) {
        this.weight = weight;
        this.corlor = corlor;
    }

    public int getWeight() {
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

    @Override
    public String toString() {
        return "Apple [corlor=" + corlor + ", weight=" + weight + "]";
    }

    

    
}
