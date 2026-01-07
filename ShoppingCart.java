import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Product, Integer> cartItems;

    public ShoppingCart() {
        cartItems = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        if (product.checkAvailability(quantity)) {
            cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
            product.reduceStock(quantity);
            System.out.println(quantity + " " + product.getName() + "(s) added to cart.");
        } else {
            System.out.println("Not enough stock for " + product.getName());
        }
    }

    public void removeProduct(Product product) {
        if (cartItems.containsKey(product)) {
            cartItems.remove(product);
            System.out.println(product.getName() + " removed from cart.");
        } else {
            System.out.println(product.getName() + " is not in the cart.");
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    public void viewCartItems() {
        System.out.println("Cart Items:");
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey().getName() + " - Quantity: " + entry.getValue() + " - Price: $" + (entry.getKey().getPrice() * entry.getValue()));
        }
    }
}
