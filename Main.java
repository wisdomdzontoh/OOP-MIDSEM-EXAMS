public class Main {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("P001", "Apple", 0.50);
        Product product2 = new Product("P002", "Banana", 0.30);

        // Create a sales transaction
        SalesTransaction transaction = new SalesTransaction("T001", "2024-07-19");
        transaction.addItem(product1);
        transaction.addItem(product2);

        // Calculate total and generate receipt
        transaction.calculateTotal();
        System.out.println(transaction.generateReceipt());

        // Create a customer
        Customer customer = new Customer("C001", "John Doe");
        customer.addPurchaseHistory(transaction);

        // Create an inventory and add products
        Inventory inventory = new Inventory("I001");
        inventory.receiveShipment(product1);
        inventory.receiveShipment(product2);

        // Display product info
        product1.displayProductInfo();
        product2.displayProductInfo();
    }
}
