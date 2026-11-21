package CHOR;

public class PaymentHandler implements Handler {
    @Override 
    public boolean handle() {
        System.out.println("проверка оплаты");
        
        return true; 
    }
    
}
