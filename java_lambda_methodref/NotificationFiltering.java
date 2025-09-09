
import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient heart rate abnormal"),
            new Alert("Info", "Patient temperature normal"),
            new Alert("Warning", "Patient needs checkup")
        );

        Predicate<Alert> criticalFilter = alert -> alert.type.equals("Critical");

        System.out.println("Filtered Alerts:");
        alerts.stream().filter(criticalFilter).forEach(System.out::println);
    }
}
