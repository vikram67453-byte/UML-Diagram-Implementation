package fig4;

public class GroundShipping implements Shipping {
    @Override
    public double getCost(Order order) {
        double weight = order.getTotalWeight();
        if (order.getTotal() > 100) {
            // free ground on big orders
            return 0.0;
        }
        return Math.max(10, weight * 1.5);
    }

    @Override
    public String getDate(Order order) {
        return "5-7 business days";
    }

    @Override
    public String toString() {
        return "Ground";
    }
}
