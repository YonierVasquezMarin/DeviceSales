package Device;

public class Telephone extends Device {
    private final int surchargeForCreditCardUse = 2000;
    public Telephone(int basePrice) {
        this.basePrice = basePrice;
    }
    @Override
    public float calculateDevicePrice(boolean withSurchargeForCreditCardUse) {
        int devicePrice = this.basePrice;
        if (withSurchargeForCreditCardUse) {
            devicePrice += this.surchargeForCreditCardUse;
        }
        return devicePrice;
    }
}
