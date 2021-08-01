package cgmouse.javainaction.chap15;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException {
       
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        work1();
        
        scheduledExecutorService.schedule(
            ScheduleExecutorServiceExample::work2, 10, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }

    public static void work1(){
        System.out.println("Hello from Work1");
    }

    public static void work2(){
        System.out.println("Number of threads: " + Thread.activeCount());
        System.out.println("Hello from Work2");

    }
}
