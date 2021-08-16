package cgmouse.javainaction.chap3;

import java.util.function.Function;

public class ComposingFunctionsTestDrive {
    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;

        //Function<Integer, Integer> h = f.andThen(g);
        Function<Integer, Integer> h = f.compose(g);
        int result = h.apply(1);

        System.out.println(result);
    }
    
}
