package CHOR;

public class ProductHandler implements Handler {
    
    @Override
    public boolean handle() {
        System.out.println("проверка наличия товара");
        
        return true; 
    }
    
}
