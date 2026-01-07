import java.util.List;

public class Customer {

    private static int nextID = 1;

    private int customerId;
    private String name;
    private String email;
    private String password;
    private ShoppingCart cart;

    public Customer(String name, String email, String password) {
        this.customerId = nextID++;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cart = new ShoppingCart();
    }

    public void register() {
        System.out.println(name + " registered successfully with ID " + customerId);
    }

    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println(name + " logged in successfully!");
            return true;
        } else {
            System.out.println("Invalid login credentials.");
            return false;
        }
    }

    public void viewProducts(List<Product> products) {
        System.out.println("Available Products:");
        for (Product p : products) {
            p.getDetails();
        }
    }

    public void addToCart(Product product, int quantity) {
        cart.addProduct(product, quantity);
    }

    public void checkout() {
        System.out.println("Checking out...");
        cart.viewCartItems();
        System.out.println("Total Price: $" + cart.calculateTotalPrice());
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}