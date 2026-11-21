package Observer;

import State.OrderState;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Observer> observers = new ArrayList<>();
    private OrderState state;

    public void follow(Observer observer) {
        observers.add(observer);
    }

    public void unfollow(Observer observer) {
        observers.remove(observer);
    }

    public void create() {
        System.out.println("заказ оформлен");
        notifyObservers("новый заказ оформлен");
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setState(OrderState state) {
        this.state = state;
        System.out.println("Состояние заказа: " + state.getStateName());
    }

    public OrderState getState() {
        return state;
    }

    public void shipped() {
        if (state != null) state.shipped(this);
    }

    public void delivered() {
        if (state != null) state.delivered(this);
    }

    public void created() {
        if (state != null) state.created(this);
    }

    public void canceled() {
        if (state != null) state.canceled(this);
    }

    public void returned() {
        if (state != null) state.returned(this);
    }

    public void paid() {
        if (state != null) state.paid(this);
    }
}
