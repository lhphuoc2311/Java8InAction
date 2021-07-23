package cgmouse.javainaction.chap1.passcode;
import java.util.List;
import cgmouse.javainaction.util.Apple;
import cgmouse.javainaction.util.Util;

public class FilteringApplesTestDriveJava8 {
    public static void main(String[] args) {
        List<Apple> lApples = FilteringApplseJava8
        .filterApplesJava8(Util.inventoryApples, FilteringApplseJava8::isGreenApple);
        Util.printAppleList(lApples);
    }
    
}
