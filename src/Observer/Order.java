package Observer;

import java.util.ArrayList;
import java.util.List;
public class Order  {
    private List<Observer> observers = new ArrayList<>();
    
    public void follow(Observer observer) {
        observers.add(observer);
    }

    public void unfollow(Observer observer) {
        observers.remove(observer);
    }
    
    public void create(){
        System.out.println("заказ оформлен");

        notifyObservers("новый заказ оформлен");
    }
    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
