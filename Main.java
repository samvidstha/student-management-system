import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200, 5));
        products.add(new Product("Smartphone", 800, 10));
        products.add(new Product("Headphones", 150, 15));

        Customer customer = new Customer("Samvid", "samvid@gmail.com", "12345");
        customer.register();
        customer.login("samvid@gmail.com", "12345");
        customer.viewProducts(products);

        customer.addToCart(products.get(0), 1);
        customer.addToCart(products.get(2), 2);

        customer.checkout();
    }
}