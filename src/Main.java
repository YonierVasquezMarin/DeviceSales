import Device.Telephone;
import Device.Laptop;
import Device.Tablet;
import Sale.PaymentMethod;
import Sale.Sale;
import Store.Store;

public class Main {
    public static void main(String[] args) {
        Sale sale1 = new Sale(new Telephone(150000), PaymentMethod.CASH);
        Sale sale2 = new Sale(new Telephone(200000), PaymentMethod.CREDIT);
        Sale sale3 = new Sale(new Tablet(300000), PaymentMethod.CREDIT);
        Sale sale4 = new Sale(new Tablet(250000), PaymentMethod.CASH);
        Sale sale5 = new Sale(new Laptop(2000000), PaymentMethod.CREDIT);
        Sale sale6 = new Sale(new Laptop(2500000), PaymentMethod.CASH);
        Store store = new Store();
        store.addSale(sale1);
        store.addSale(sale2);
        store.addSale(sale3);
        store.addSale(sale4);
        store.addSale(sale5);
        store.addSale(sale6);
        System.out.println("Total sales: " + store.calculateTotalSales());
    }
}