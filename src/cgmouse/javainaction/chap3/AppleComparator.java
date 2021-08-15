package cgmouse.javainaction.chap3;

import java.util.Comparator;

import cgmouse.javainaction.util.Apple;

public class AppleComparator implements Comparator<Apple>{

    @Override
    public int compare(Apple o1, Apple o2) {
        // TODO Auto-generated method stub
        return o1.getWeight().compareTo(o2.getWeight());
    }
    
}
