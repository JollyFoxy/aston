package DZ5.Strategy;

public class ExpressDelivery implements DeliveryStrategy {

    private final int PRISE = 500;

    @Override
    public int calculateDeliveryCost() {
        return PRISE;
    }

}
