package VehicleRentalSystem;

public class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 0.15 * getRentalRate(); 
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance @15% of rental rate";
    }
}
