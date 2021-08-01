package cgmouse.javainaction.chap15;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import cgmouse.javainaction.util.Functions;

public class ExecutorServiceExample {
    public static void main(String[] args) 
    throws InterruptedException, ExecutionException {
        int x = 5;

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
        Future<Integer> y = executorService.submit(()->Functions.fo(x));
        Future<Integer> z = executorService.submit(()->Functions.go(x));

        System.out.println(y.get() + z.get());
        
        executorService.shutdown();
        
    }
    
}
