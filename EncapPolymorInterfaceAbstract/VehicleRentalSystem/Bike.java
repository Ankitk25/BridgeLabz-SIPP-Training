package VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 0.05 * getRentalRate();
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance @5% of rental rate";
    }
}
