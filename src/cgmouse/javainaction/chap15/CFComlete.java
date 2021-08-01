package cgmouse.javainaction.chap15;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cgmouse.javainaction.util.Functions;

public class CFComlete {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int x= 1337;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CompletableFuture<Integer> a = new CompletableFuture<>();

        executorService.submit(() -> a.complete(Functions.f(x)));

        int b = Functions.g(x);

        System.out.println(a.get() + b);

        executorService.shutdown();
        
    }

    
    
    
}
