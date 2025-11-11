package fig4;

import java.util.List;

public class MainFig4 {
    public static void main(String[] args) {
        System.out.println("--- Fig4 Demo: Shipping strategy pattern ---");

        Order smallOrder = new Order(List.of("book", "pen"), 45.0, 3.2);
        smallOrder.setShipping(new GroundShipping());
        System.out.println("Small order: " + smallOrder);
        System.out.println(" Shipping method: " + smallOrder.getShipping());
        System.out.println(" Shipping cost: " + smallOrder.getShippingCost());
        System.out.println(" Delivery ETA: " + smallOrder.getShippingDate());
        System.out.println();

        Order bigOrder = new Order(List.of("laptop"), 1200.0, 4.5);
        bigOrder.setShipping(new GroundShipping());
        System.out.println("Big order: " + bigOrder);
        System.out.println(" Shipping method: " + bigOrder.getShipping());
        System.out.println(" Shipping cost: " + bigOrder.getShippingCost() + " (free ground expected)");
        System.out.println(" Delivery ETA: " + bigOrder.getShippingDate());
        System.out.println();

        Order express = new Order(List.of("camera"), 300.0, 2.0);
        express.setShipping(new AirShipping());
        System.out.println("Express order: " + express);
        System.out.println(" Shipping method: " + express.getShipping());
        System.out.println(" Shipping cost: " + express.getShippingCost());
        System.out.println(" Delivery ETA: " + express.getShippingDate());
    }
}
