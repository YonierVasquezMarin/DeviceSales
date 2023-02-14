package Device;

public class Laptop extends Device {
    private final float priceIncrease = 0.1f;
    private final int surchargeForCreditCardUse = 10000;
    public Laptop(int basePrice) {
        this.basePrice = basePrice;
    }
    @Override
    public float calculateDevicePrice(boolean withSurchargeForCreditCardUse) {
        float devicePrice = this.basePrice + (this.basePrice * this.priceIncrease);
        if (withSurchargeForCreditCardUse) {
            devicePrice += surchargeForCreditCardUse;
        }
        return devicePrice;
    }
}
