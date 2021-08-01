package cgmouse.javainaction.chap15;

import java.util.function.Function;

import cgmouse.javainaction.util.Functions;

public class SequentialSimulate {

    public static void sequential(int x){
        int y = Functions.f(x);
        int z = Functions.g(x);

        System.out.println(y + z);
    }
    
}
