package OnlineFoodDeliverySystem;

public class VegItem extends FoodItem implements Discountable {
    private double discountPercent;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountPercent = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discountPercent / 100);
    }

    @Override
    public void applyDiscount(double percent) {
        this.discountPercent = percent;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountPercent + "% on Veg Item";
    }
}
