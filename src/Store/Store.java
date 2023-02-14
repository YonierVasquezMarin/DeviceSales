package Store;

import Sale.Sale;

import java.util.ArrayList;

public class Store {
    private ArrayList<Sale> sales = new ArrayList<Sale>();
    public void addSale(Sale sale){
        sales.add(sale);
    }
    public float calculateTotalSales(){
        float total = 0;
        for (Sale sale : sales) {
            total += sale.calculateSalesPrice();
        }
        return total;
    }
}
