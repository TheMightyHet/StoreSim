/**
* Represents a product available for purchase in the store.
*/
public class Product {
    private String name;
    private int price;

    /**
    * Initializes a new product with the specified name and price.
    *
    * @param name  The name of the product.
    * @param price The price of the product.
    */
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
    * Retrieves the name of the product.
    *
    * @return The name of the product.
    */
    public String getName() {
        return name;
    }

    /**
    * Retrieves the price of the product.
    *
    * @return The price of the product in the store's currency.
    */
    public int getPrice() {
        return price;
    }
}
