package State;

import Observer.Order;

public class ShippedState implements OrderState {
    @Override
    public void shipped(Order order) {
        System.out.println("Ошибка: заказ уже отправлен");
    }

    @Override
    public void delivered(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void created(Order order) {
        System.out.println("Ошибка: заказ уже оформлен");
    }

    @Override
    public void canceled(Order order) {
        order.setState(new CanceledState());
    }

    @Override
    public void returned(Order order) {
        System.out.println("Ошибка: дождитесь доставки заказа");
    }

    @Override
    public void paid(Order order) {
        System.out.println("Ошибка: заказ уже оплачен");
    }

    @Override
    public String getStateName() {
        return "отправлен";
    }
}