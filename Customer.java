import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerID;
    private String name;
    private String contactDetails;
    private List<SalesTransaction> purchaseHistory;
    private int loyaltyPoints;

    public Customer(String customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.purchaseHistory = new ArrayList<>();
    }

    public void addPurchaseHistory(SalesTransaction transaction) {
        purchaseHistory.add(transaction);
    }

    public void updateContactDetails(String newContactDetails) {
        this.contactDetails = newContactDetails;
    }

    public void applyLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
    }
}
