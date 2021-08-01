package cgmouse.javainaction.chap15;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import cgmouse.javainaction.util.Functions;

public class FutureBasedTestDrive {
    public static void main(String[] args) 
    throws InterruptedException, ExecutionException {
        int x = 5;
        futureBased(x);        
    }

    private static void futureBased(int x) 
    throws InterruptedException, ExecutionException{
        Future<Integer> y = Functions.ff(x);
        Future<Integer> z = Functions.gf(x);

        System.out.println(y.get() + z.get());
    }
    
}
