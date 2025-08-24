package DZ5.Strategy;

public class PostDelivery implements DeliveryStrategy {
    private final int PRISE = 150;

    @Override
    public int calculateDeliveryCost() {
        return PRISE;
    }

}
