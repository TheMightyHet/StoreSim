import java.util.ArrayList;
import java.util.List;

/**
* Represents a shopping cart that stores a collection of products for purchase.
*/
public class ShoppingCart {
    private List<Product> products;

    /**
     * Initializes a new shopping cart.
     */
    public ShoppingCart() {
        products = new ArrayList<>();
    }

    /**
    * Adds a product to the shopping cart.
    *
    * @param product The product to be added to the cart.
    */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
    * Retrieves the list of products in the shopping cart.
    *
    * @return The list of products in the cart.
    */
    public List<Product> getProducts() {
        return products;
    }

    /**
    * Retrieves the price of a specific product in the shopping cart.
    *
    * @param productName The name of the product for which to retrieve the price.
    * @return            The price of the specified product.
    */
    public int getProductPrice(String productName) {
        int productPrice = 0;
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                productPrice = product.getPrice();
            }
        }
        return productPrice;
    }
}
