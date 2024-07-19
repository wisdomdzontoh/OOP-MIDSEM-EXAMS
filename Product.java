public class Product {
    private String productID;
    private String name;
    private String description;
    private double price;
    private String category;
    private int stockLevel;

    public Product(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public void updateStockLevel(int newStockLevel) {
        this.stockLevel = newStockLevel;
    }

    public void displayProductInfo() {
        System.out.println("Product: " + name + " Price: " + price);
    }

    public double getPrice() {
        return price;
    }
}
