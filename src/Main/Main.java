package Main;

import Command.*;
import Observer.*;
import State.*;
import Strategy.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST ===");
        testDeliveryService();
        testObserver();
        testState();
        testCommand();
    }

    private static void testDeliveryService() {
        System.out.println("\n=== STRATEGY ===");
        DeliveryService service = new DeliveryService(new ExpressDelivery());

        service.Calculate();

        service.setStrategy(new NormalDelivery());
        service.Calculate();

        service.setStrategy(new PickupDelivery());
        service.Calculate();
    }

    private static void testObserver() {
        System.out.println("\n=== OBSERVER ===");
        Order order = new Order();

        order.follow(new EmailNotifier());
        order.follow(new AdminNotifier());

        order.create();
    }

    private static void testState() {
        System.out.println("\n=== STATE ===");

        Order order = new Order();
        order.setState(new CreatedState());
        order.paid();
        order.shipped();
        order.delivered();
        order.returned();

        System.out.println("Проверка финального состояния:");
        order.shipped();
        order.delivered();
        order.paid();

        Order canceledOrder = new Order();
        canceledOrder.setState(new CreatedState());
        canceledOrder.canceled();
        canceledOrder.paid();
    }

    private static void testCommand() {
        System.out.println("\n=== COMMAND ===");
        Editor editor = new Editor();

        Button addButton = new Button (new AddCommand(editor));
        Button removeButton = new Button(new RemoveCommand(editor));

       

        addButton.click();
        removeButton.click();
    }
}
