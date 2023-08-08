/**
 * Represents a Deal where if someone purchases a D products and buys one E product along with them, then the total price will have a 30% tax.
 */
public class DealDE implements Deal {

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
        int eCount = 0;
        
        // Count the occurrences of D and E products in the cart
        for (Product product : cart.getProducts()) {
            if (product.getName().equals("D")) {
                ++dCount;
            }
            else if (product.getName().equals("E")) {
                ++eCount;
            }
        }

        int newTotalPrice = 0;

        // Check if the conditions for the deal are met
        if (dCount > 0 && eCount > 0) {
            newTotalPrice = (int)(totalPrice * 1.3);
            return newTotalPrice;
        }

        return totalPrice;
    }
}
