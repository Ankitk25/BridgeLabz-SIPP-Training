package RideHailingApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> rides = new ArrayList<>();

        Vehicle car1 = new Car("C123", "Alice", 15.0, "MG Road");
        Vehicle bike1 = new Bike("B456", "Bob", 10.0, "Indiranagar");
        Vehicle auto1 = new Auto("A789", "Charlie", 12.0, "Whitefield");

        rides.add(car1);
        rides.add(bike1);
        rides.add(auto1);

        double distance = 10; // 10 km ride

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            double fare = v.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: ₹" + fare);

            if (v instanceof GPS gps) {
                gps.updateLocation("Electronic City");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }

            System.out.println("------------------------------");
        }
    }
}
