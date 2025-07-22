import java.util.Locale;
import java.util.Scanner;

public class CoffeeCounterChronicles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Coffee Type");
        System.out.println("Cafe Latte\nCappuccino\nAmericano\nFlat White\n");
        String coffee = sc.nextLine().toLowerCase();
        System.out.println("Enter Quantity");
        2006850
        int qty = sc.nextInt();
        int price = 0;
        switch (coffee) {
            case "cafe latte":
                price = 150;
                break;
            case "cappuccino":
                price = 120;
                break;
            case "americano":
                price = 130;
                break;
            case "flat white":
                price = 110;
                break;
            default:
                System.out.println("Not available");
                System.exit(-1);
        }
        price *= qty;
        float gst = (18 * price) / 100f;
        float totalAmount = price + gst;
        System.out.println("Price   Rs. " + price);
        System.out.println("GST     Rs. " + gst);
        System.out.println("Total   Rs. " + totalAmount);
    }
}

