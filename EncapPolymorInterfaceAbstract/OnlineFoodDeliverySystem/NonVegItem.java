package OnlineFoodDeliverySystem;

public class NonVegItem extends FoodItem implements Discountable {
    private double discountPercent;
    private static final double NON_VEG_CHARGE = 30.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountPercent = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double base = getPrice() * getQuantity();
        double surcharge = NON_VEG_CHARGE * getQuantity();
        double total = base + surcharge;
        return total - (total * discountPercent / 100);
    }

    @Override
    public void applyDiscount(double percent) {
        this.discountPercent = percent;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountPercent + "% + ₹" + NON_VEG_CHARGE + "/item non-veg charge";
    }
}
