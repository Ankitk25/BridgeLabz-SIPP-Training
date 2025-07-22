import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventTicketingSystem ets = new EventTicketingSystem();
        int choice;
        do {
            System.out.println("\nEvent Ticketing System Menu");
            System.out.println("1. Create Event");
            System.out.println("2. Book Ticket");
            System.out.println("3. Get Attendee Position");
            System.out.println("4. Print Event Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter event name: ");
                    String eventName = sc.nextLine();
                    ets.createEvent(eventName);
                    break;
                case 2:
                    System.out.print("Enter event name: ");
                    eventName = sc.nextLine();
                    System.out.print("Enter attendee name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    Attendee attendee;
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    attendee = new Attendee(name, age, email);
                    ets.bookTicket(eventName, attendee);
                    break;
                case 3:
                    System.out.print("Enter event name: ");
                    eventName = sc.nextLine();
                    System.out.print("Enter attendee Email: ");
                    email = sc.nextLine();
                    int position = ets.getPosition(eventName, email);
                    if (position == -1) {
                        System.out.println(email + " not found in queue.");
                    } else {
                        System.out.println(email+" is at position "+position);
                    }
                    break;
                case 4:
                    System.out.print("Enter event name: ");
                    eventName = sc.nextLine();
                    ets.printQueue(eventName);
                    break;

                case 5:
                    System.out.println("Exiting...Thank you");
                    break;

                default:
                    System.out.println("Invalid choice try again.");
            }
        } while (choice != 5);

    }
}