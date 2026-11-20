package Observer;
public class EmailNotifier implements Observer {
     
     public void update(String message) {
         System.out.println("Email: " + message);
     }
 }