package State;

import Observer.Order;

public class ReturnedState implements OrderState {
    @Override
    public void shipped(Order order) {
        System.out.println("Ошибка: возвращенный заказ нельзя отправить повторно");
    }

    @Override
    public void delivered(Order order) {
        System.out.println("Ошибка: заказ уже был доставлен и возвращен");
    }

    @Override
    public void created(Order order) {
        System.out.println("Ошибка: для нового заказа создайте другой объект Order");
    }

    @Override
    public void canceled(Order order) {
        System.out.println("Заказ уже завершен возвратом");
    }

    @Override
    public void returned(Order order) {
        System.out.println("Заказ уже возвращен");
    }

    @Override
    public void paid(Order order) {
        System.out.println("Ошибка: возвращенный заказ нельзя оплатить повторно");
    }

    @Override
    public String getStateName() {
        return "возвращен";
    }
}
