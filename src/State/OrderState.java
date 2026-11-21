package State;

import Observer.Order;

public interface OrderState {
    void shipped(Order order);
    void delivered(Order order);
    void created(Order order);
    void canceled(Order order);
    void returned(Order order);
    void paid(Order order);
    String getStateName();
}