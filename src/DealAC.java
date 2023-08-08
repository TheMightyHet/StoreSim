/**
 * Represents a Deal where if someone purchases two A products and buys one C product along with them,
 * then one C product is half-price. The second C product is charged at the original price.
 */
 public class DealAC implements Deal {

    /**
     * Applies the DealAC rule to the total price based on the items in the shopping cart.
     *
     * @param cart       List of products contained in the shopping cart.
     * @param totalPrice The current total price of the items in the cart.
     * @return           The updated total price after applying the deal.
     */
    @Override
    public int applyDeal(ShoppingCart cart, int totalPrice) {
        int cCount = 0;
        int aCount = 0;

        // Count the occurrences of A and C products in the cart
        for (Product product : cart.getProducts()) {
            if (product.getName().equals("A")) {
                ++aCount;
            }
            else if (product.getName().equals("C")) {
                ++cCount;
            }
        }

        int newTotalPrice = 0;

        //Deals work once per Cart
        // Check if the conditions for the deal are met
        if (aCount >= 2 && cCount >= 1) {
            newTotalPrice = totalPrice - (int)(cart.getProductPrice("C") / 2);
            return newTotalPrice;
        }

        //Deals work multiple times per Cart
        // Check if the conditions for the deal are met
        /*if (aCount >= 2 && cCount >= 1) {
            // Calculate the multiplier for the deal based on available C products and A pairs
            int dealMultiplier = cCount - (int)(aCount / 2) < 0 ? cCount : (int)(aCount / 2);
            newTotalPrice = totalPrice - dealMultiplier * (int)(cart.getProductPrice("C") / 2);
            return newTotalPrice;
        }*/

        return totalPrice;
    }
}
