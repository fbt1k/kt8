package Main;
import Strategy.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST ===");
        testDeliveryService();
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
}
