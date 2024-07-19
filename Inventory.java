import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private String inventoryID;
    private List<Product> productList;
    private int reorderPoints;

    public Inventory(String inventoryID) {
        this.inventoryID = inventoryID;
        this.productList = new ArrayList<>();
    }

    public void trackQuantity() {
        // Implementation here
    }

    public void receiveShipment(Product product) {
        productList.add(product);
    }

    public void updateInventory(Product product) {
        // Implementation here
    }
}
