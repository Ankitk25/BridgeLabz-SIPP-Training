package ECommercePlatform;

public class Electronics extends Product implements Taxable {
    private double taxRate = 0.18; 
    private double discountRate = 0.10;
    

    public Electronics(int productId, String name, double price) {
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
        return "18% GST applied on Electronics";
    }
}
