package Device;

public abstract class Device {
    protected int basePrice;
    public abstract float calculateDevicePrice(boolean withSurchargeForCreditCardUse);
}
