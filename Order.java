package fig4;

import java.util.List;

public class Order {
    private final List<String> lineItems;
    private Shipping shipping;
    private final double total;
    private final double totalWeight;

    public Order(List<String> lineItems, double total, double totalWeight) {
        this.lineItems = lineItems;
        this.total = total;
        this.totalWeight = totalWeight;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public double getTotal() {
        return total;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public double getShippingCost() {
        if (shipping == null) throw new IllegalStateException("Shipping method not set");
        return shipping.getCost(this);
    }

    public String getShippingDate() {
        if (shipping == null) throw new IllegalStateException("Shipping method not set");
        return shipping.getDate(this);
    }

    @Override
    public String toString() {
        return "Order(total=" + total + ", weight=" + totalWeight + ")";
    }
}
