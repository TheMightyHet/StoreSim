import java.util.HashMap;
import java.util.Map;

/**
 * Represents a store that offers various products and deals for shopping.
 */

public class Store {
    private Map<String, Product> products;
    private Map<String, Deal> deals;

    /**
     * Initializes the store with products and deals.
     */
    public Store() {
        products = new HashMap<>();
        deals = new HashMap<>();
        initializeProducts();
        initializeDeals();
    }

    /**
     * Initializes the available products in the store.
     */
    private void initializeProducts() {
        products.put("A", new Product("A", 55));
        products.put("B", new Product("B", 20));
        products.put("C", new Product("C", 60));
        products.put("D", new Product("D", 10));
        products.put("E", new Product("E", 45));
    }

    /**
     * Initializes the available deals in the store for the current week.
     */
    private void initializeDeals() {
        deals.put("DealAC", new DealAC());
        deals.put("DealD", new DealD());
        deals.put("DealDE", new DealDE());
    }

    /**
     * Calculates the total price for the provided cart's content, considering products and applicable deals.
     *
     * @param cartItems An array of product codes representing the cart's content.
     * @return          The total price for the cart's content after applying deals.
     */
    public int calculateTotalPrice(String[] cartContent) {
        ShoppingCart cart = new ShoppingCart();

        // Add the selected products to the shopping cart
        for (String item : cartContent) {
            Product product = products.get(item);
            if (product != null) {
                cart.addProduct(product);
            }
        }

        int totalPrice = 0;

        // Calculate the total price of the products in the cart
        for (Product product : cart.getProducts()) {
            totalPrice += product.getPrice();
        }

        // Apply all applicable deals to the calculated total price
        for (Deal deals : deals.values()) {
            totalPrice = deals.applyDeal(cart, totalPrice);
        }

        return totalPrice;
    }




    

    /**
     * The entry point of the program. Parses command-line arguments and calculates the total price.
     *
     * @param args The command-line arguments representing the cart's content.
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Store product1 product2 product3 ...");
            return;
        }

        Store store = new Store();
        int totalPrice = store.calculateTotalPrice(args);
        System.out.println(totalPrice);
    }
}
