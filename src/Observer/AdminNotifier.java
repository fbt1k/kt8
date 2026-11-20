package Observer;

public class AdminNotifier implements Observer {
     
     public void update(String message) {
         System.out.println("Admin: " + message);
     }
    
}
