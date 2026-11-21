package CHOR;

import java.util.List;

public class OrderProcessor {
    private List<Handler> handlers;

    public OrderProcessor(List<Handler> handlers) {
        this.handlers = handlers;
    }

    public void processOrder() {
        for (Handler handler : handlers) {
           if(!handler.handle()) {
               System.out.println("обработка заказа прервана");
               return;
           }
        }
        System.out.println("заказ оформлен");
    }
}
