package VehicleRentalSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("KA01AB1234", 1500, "CAR2025INS"));
        vehicles.add(new Bike("KA05XY9999", 500, "BIKE2025INS"));
        vehicles.add(new Truck("KA09TR1111", 4000, "TRUCK2025INS"));

        int days = 3;

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for " + days + " days: ₹" + v.calculateRentalCost(days));

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance: ₹" + ins.calculateInsurance());
                System.out.println("Insurance Info: " + ins.getInsuranceDetails());
            }

            System.out.println("----------------------------------");
        }
    }
}

