package cgmouse.javainaction.chap15;

import java.util.function.IntConsumer;

import cgmouse.javainaction.util.Functions;

public class CallbasckStyleExample {

    public static void main(String[] args) {
        int x = 1337;
        Result result = new Result();
        f(x, (int y) -> {
            result.left = y;
            System.out.println(result.left + result.right);
        });

        g(x, (int z) -> {
            result.right = z;
            System.out.println(result.left + result.right);

        });

        

      

    }

private static void f(int x, IntConsumer dealWtiResult){
  
    dealWtiResult.accept(Functions.f(x));
    
}

private static void g(int x, IntConsumer dealWithResult){
    dealWithResult.accept(Functions.g(x));
}

    private static class Result{
        private int left;
        private int right;
    }

}
