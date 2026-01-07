public class Product {

    private static int nextID = 1;

    private int productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        this.productId = nextID++;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void getDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: $" + price + ", Stock: " + stockQuantity);
    }

    public boolean checkAvailability(int quantity) {
        return stockQuantity >= quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void reduceStock(int quantity) {
        if (checkAvailability(quantity)) {
            stockQuantity -= quantity;
        }
    }
}