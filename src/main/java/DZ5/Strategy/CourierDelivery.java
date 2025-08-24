package DZ5.Strategy;

public class CourierDelivery implements DeliveryStrategy {

    private final int PRISE = 300;

    @Override
    public int calculateDeliveryCost() {
        return PRISE;
    }

}
