package RideHailingApp;

public abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String location;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String location) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.location = location;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    protected void setLocation(String location) {
        this.location = location;
    }

    protected String getLocation() {
        return location;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate/km: ₹" + ratePerKm);
        System.out.println("Current Location: " + location);
    }

    public abstract double calculateFare(double distance);
}
