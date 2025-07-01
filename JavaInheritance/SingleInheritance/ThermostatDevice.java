class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String deviceId, String status, double temp) {
        super(deviceId, status);
        this.temperatureSetting = temp;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature: " + temperatureSetting + "°C");
    }

    public static void main(String[] args) {
        Thermostat t = new Thermostat("T123", "Active", 22.5);
        t.displayStatus();
    }
}