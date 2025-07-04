package ECommercePlatform;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Smartphone", 30000));
        products.add(new Clothing(102, "Jacket", 5000));
        products.add(new Groceries(103, "Rice Bag", 2000));

        for (Product p : products) {
            p.displayDetails();

            double tax = 0;
            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                tax = t.calculateTax();
                System.out.println("Tax: ₹" + tax + " (" + t.getTaxDetails() + ")");
            } else {
                System.out.println("Tax: ₹0 (Non-taxable item)");
            }

            double discount = p.calculateDiscount();
            System.out.println("Discount: ₹" + discount);

            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("-------------------------------");
        }
    }
}
