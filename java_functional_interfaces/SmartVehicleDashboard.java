
interface VehicleDashboard {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery info not available.");
    }
}

class CarDashboard implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("Car speed is 80 km/h");
    }
}

class ElectricCarDashboard implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("EV speed is 60 km/h");
    }
    public void displayBattery() {
        System.out.println("Battery at 75%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        VehicleDashboard car = new CarDashboard();
        VehicleDashboard ev = new ElectricCarDashboard();

        car.displaySpeed();
        car.displayBattery();
        ev.displaySpeed();
        ev.displayBattery();
    }
}
