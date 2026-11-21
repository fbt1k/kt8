package State;

import Observer.Order;

public class DeliveredState implements OrderState {
    @Override
    public void shipped(Order order) {
        System.out.println("Ошибка: заказ уже доставлен");
    }

    @Override
    public void delivered(Order order) {
        System.out.println("Ошибка: заказ уже доставлен");
    }

    @Override
    public void created(Order order) {
        System.out.println("Ошибка: заказ уже оформлен");
    }

    @Override
    public void canceled(Order order) {
        System.out.println("Ошибка: доставленный заказ нельзя отменить, можно вернуть");
    }

    @Override
    public void returned(Order order) {
        order.setState(new ReturnedState());
    }

    @Override
    public void paid(Order order) {
        System.out.println("Ошибка: заказ уже оплачен");
    }

    @Override
    public String getStateName() {
        return "доставлен";
    }
}
