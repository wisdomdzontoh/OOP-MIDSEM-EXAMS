import java.util.ArrayList;
import java.util.List;

public class SalesTransaction {
    private String transactionID;
    private String date;
    private List<Product> itemsSold;
    private double totalAmount;

    public SalesTransaction(String transactionID, String date) {
        this.transactionID = transactionID;
        this.date = date;
        this.itemsSold = new ArrayList<>();
    }

    public double calculateTotal() {
        totalAmount = 0;
        for (Product item : itemsSold) {
            totalAmount += item.getPrice();
        }
        return totalAmount;
    }

    public void applyDiscount(double discount) {
        totalAmount -= discount;
    }

    public String generateReceipt() {
        return "Receipt for transaction " + transactionID;
    }

    public void addItem(Product product) {
        itemsSold.add(product);
    }
}
