package Sale;

import Device.Device;

public class Sale {
    private Device device;
    private PaymentMethod paymentMethod;
    public Sale(Device device, PaymentMethod paymentMethod) {
        this.device = device;
        this.paymentMethod = paymentMethod;
    }
    public float calculateSalesPrice() {
        return device.calculateDevicePrice(paymentMethod == PaymentMethod.CREDIT);
    }
}
