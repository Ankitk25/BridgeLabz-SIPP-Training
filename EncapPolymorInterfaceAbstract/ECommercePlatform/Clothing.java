package ECommercePlatform;

public class Clothing extends Product implements Taxable {
    private double taxRate = 0.12; 
    private double discountRate = 0.20;

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "12% GST applied on Clothing";
    }
}
