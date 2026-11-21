package State;

import Observer.Order;

public class PaidState implements OrderState {
    @Override
    public void shipped(Order order) {
        order.setState(new ShippedState());
    }

    @Override
    public void delivered(Order order) {
        System.out.println("Ошибка: оплаченный заказ еще не отправлен");
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
        System.out.println("Ошибка: оплаченный заказ не был доставлен");
    }

    @Override
    public void paid(Order order) {
        System.out.println("Ошибка: заказ уже оплачен");
    }

    @Override
    public String getStateName() {
        return "оплачен";
    }
}
