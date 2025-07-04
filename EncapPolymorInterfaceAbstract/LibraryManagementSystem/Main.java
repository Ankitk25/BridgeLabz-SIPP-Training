package LibraryManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();

        LibraryItem b1 = new Book("B101", "The Alchemist", "Paulo Coelho");
        LibraryItem m1 = new Magazine("M202", "Time", "Time Inc.");
        LibraryItem d1 = new DVD("D303", "Inception", "Christopher Nolan");

        items.add(b1);
        items.add(m1);
        items.add(d1);

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + (r.checkAvailability() ? "Yes" : "No"));
                if (r.reserveItem("John Doe")) {
                    System.out.println("Reserved successfully for John Doe.");
                } else {
                    System.out.println("Already reserved.");
                }
                System.out.println("Available After Reservation: " + (r.checkAvailability() ? "Yes" : "No"));
            }

            System.out.println("----------------------------");
        }
    }
}
