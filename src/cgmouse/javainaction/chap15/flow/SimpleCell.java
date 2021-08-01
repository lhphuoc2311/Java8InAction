package cgmouse.javainaction.chap15.flow;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class SimpleCell implements Publisher<Integer>, Subscriber<Integer>{
    private int value = 0;
    private String name;
    private List<Subscriber> subscribers = new ArrayList<>();


    public SimpleCell(String name) {
        this.name = name;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onNext(Integer newValue) {
        this.value = newValue;
        System.out.println(this.name + ":" + this.value);
        notifyAllSubscribers();
        
    }

    @Override
    public void onError(Throwable throwable) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onComplete() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void subscribe(Subscriber<? super Integer> subscriber) {
        // TODO Auto-generated method stub
        subscribers.add(subscriber);
        
    }

    public void notifyAllSubscribers(){
        subscribers.forEach(subscriber -> subscriber.onNext(this.value));
    }

    @Override
    public String toString() {
        return "[name=" + name + ", value=" + value + "]";
    }

    
    
}
