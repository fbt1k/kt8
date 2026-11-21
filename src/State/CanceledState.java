package State;

import Observer.Order;

public class CanceledState implements OrderState {
    @Override
    public void shipped(Order order) {
        System.out.println("Ошибка: отмененный заказ нельзя отправить");
    }

    @Override
    public void delivered(Order order ) {
        System.out.println("Ошибка: отмененный заказ нельзя доставить");
    }

    @Override
    public void created(Order order) {
        System.out.println("Ошибка: отмененный заказ уже оформлен ранее");
    }

    @Override
    public void canceled(Order order) {
        System.out.println("Заказ уже отменен");
    }

    @Override
    public void returned(Order order) {
        System.out.println("Ошибка: отмененный заказ нельзя вернуть");
    }

    @Override
    public void paid(Order order) {
        System.out.println("Ошибка: отмененный заказ нельзя оплатить");
    }
    @Override
    public String getStateName() {
        return "отменен";
    }
}
