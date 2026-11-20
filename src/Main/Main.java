package Main;
import Observer.*;
import Strategy.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST ===");
        testDeliveryService();
        testObserver();
    }

    private static void testDeliveryService() {
        DeliveryService service = new DeliveryService(
            new ExpressDelivery()
        );
        
            service.Calculate();

            service.setStrategy(new NormalDelivery());
            service.Calculate();

            service.setStrategy(new PickupDelivery());
            service.Calculate();
    }

    private static void testObserver(){
        Order order = new Order();
        
        order.follow(new EmailNotifier());
        order.follow(new AdminNotifier());
        
        order.create();
    }
}
