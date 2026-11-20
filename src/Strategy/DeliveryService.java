package Strategy;

public class DeliveryService {
    private DeliveryStrategy strategy;

    public DeliveryService(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }
    public void  Calculate() {
        System.out.println("стоимость доставки: " + strategy.calculate());
    }
}
