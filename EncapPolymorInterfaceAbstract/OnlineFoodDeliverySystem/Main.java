package OnlineFoodDeliverySystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FoodItem> order = new ArrayList<>();

        FoodItem f1 = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 3);

        // Apply discounts
        if (f1 instanceof Discountable d1) d1.applyDiscount(10);
        if (f2 instanceof Discountable d2) d2.applyDiscount(5);

        order.add(f1);
        order.add(f2);

        double grandTotal = 0;
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            if (item instanceof Discountable d) {
                System.out.println(d.getDiscountDetails());
            }

            double total = item.calculateTotalPrice();
            System.out.println("Total after discount: ₹" + total);
            System.out.println("----------------------------");
            grandTotal += total;
        }

        System.out.println("Grand Total: ₹" + grandTotal);
    }
}
