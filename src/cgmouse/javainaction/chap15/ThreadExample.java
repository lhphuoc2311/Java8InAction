package cgmouse.javainaction.chap15;

import cgmouse.javainaction.util.Functions;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        int x = 5;
        Result result = new Result();

        Thread t1 = new Thread(() -> {result.left = Functions.f(x);});
        Thread t2 = new Thread(() -> {result.right = Functions.g(x);});
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(result.left + result.right);

        
    }

    private static class Result{
        private int left;
        private int right;
    }

}
