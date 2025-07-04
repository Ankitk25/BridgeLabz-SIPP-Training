package VehicleRentalSystem;

public class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; 
    }

    @Override
    public double calculateInsurance() {
        return 0.25 * getRentalRate(); 
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance @25% of rental rate + ₹1000 fixed cost";
    }
}
