/**
* Represents a deal that can be applied to a shopping cart to provide discounts or offers.
*/
public interface Deal {

    /**
     * Applies the deal to the provided shopping cart and updates the total price accordingly.
     *
     * @param cart       The shopping cart containing the products.
     * @param totalPrice The current total price of the products in the cart.
     * @return           The updated total price after applying the deal.
     */
    int applyDeal(ShoppingCart cart, int totalPrice);
}