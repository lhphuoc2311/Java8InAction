package cgmouse.javainaction.chap15;

public class SequentialTestDrive {
    public static void main(String[] args) {
        int x = 5;
        SequentialSimulate.sequential(x);
        long l = 1_000_000;
        System.out.println(l);
    }
    
}
