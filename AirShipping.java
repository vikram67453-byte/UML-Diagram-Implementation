package fig4;

public class AirShipping implements Shipping {
    @Override
    public double getCost(Order order) {
        double weight = order.getTotalWeight();
        return Math.max(25, weight * 4.0);
    }

    @Override
    public String getDate(Order order) {
        return "1-2 business days";
    }

    @Override
    public String toString() {
        return "Air";
    }
}
