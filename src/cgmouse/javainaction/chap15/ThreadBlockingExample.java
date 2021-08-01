package cgmouse.javainaction.chap15;

public class ThreadBlockingExample {
    public static void main(String[] args) throws InterruptedException {
        work1();
        Thread.sleep(10000);
        work2();

    }

    public static void work1(){
        System.out.println("Hello from Work1");
    }

    public static void work2(){
        System.out.println("Hello from Work2");
    }
    
}
