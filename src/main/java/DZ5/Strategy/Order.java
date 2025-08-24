package DZ5.Strategy;

public class Order {
    private int sum;
    private DeliveryStrategy deliveryStrategy;

    public Order(int sum) {
        this.sum = sum;
    }

    public void setDeliveryStrategy(DeliveryStrategy delivery) {
        this.deliveryStrategy = delivery;
    }

    public int calculateTotal() {
        return sum + deliveryStrategy.calculateDeliveryCost();
    }
}
