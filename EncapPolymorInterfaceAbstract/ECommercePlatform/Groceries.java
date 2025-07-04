package ECommercePlatform;

public class Groceries extends Product {
    private double discountRate = 0.05;

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

}
