package Device;

public class Tablet extends Device {
    private final float priceIncrease = 0.05f;
    private final int surchargeForCreditCardUse = 5000;
    public Tablet(int basePrice) {
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
