/**
 * Represents a Deal where if someone purchases three D products, then one D product is free.
 */
public class DealD implements Deal {

    /**
     * Applies the DealAC rule to the total price based on the items in the shopping cart.
     *
     * @param cart       List of products contained in the shopping cart.
     * @param totalPrice The current total price of the items in the cart.
     * @return           The updated total price after applying the deal.
     */
    @Override
    public int applyDeal(ShoppingCart cart, int totalPrice) {
        int dCount = 0;

        // Count the occurrences of D products in the cart
        for (Product product : cart.getProducts()) {
            if (product.getName().equals("D")) {
                ++dCount;
            }
        }

        int newTotalPrice = 0;

        // Check if the conditions for the deal are met
        if (dCount > 2) {
            int dTriplets = dCount - dCount % 3;
            int dealMultiplier = (int)(dTriplets / 3);
            newTotalPrice = totalPrice - dealMultiplier * cart.getProductPrice("D");
            return newTotalPrice;
        }

        return totalPrice;
    }
}
