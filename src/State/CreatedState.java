package State;

import Observer.Order;

public class CreatedState implements OrderState {
    @Override
    public void shipped(Order order) {
        System.out.println("Ошибка: сначала оплатите заказ");
    }

    @Override
    public void delivered(Order order) {
        System.out.println("Ошибка: заказ еще не отправлен");
    }

    @Override
    public void created(Order order) {
        System.out.println("Заказ уже оформлен");
    }

    @Override
    public void canceled(Order order) {
        order.setState(new CanceledState());
    }

    @Override
    public void returned(Order order) {
        System.out.println("Ошибка: оформленный заказ еще не доставлен");
    }

    @Override
    public void paid(Order order) {
        order.setState(new PaidState());
    }

    @Override
    public String getStateName() {
        return "оформлен";
    }
}
