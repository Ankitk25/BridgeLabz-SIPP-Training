
import java.util.*;

interface LightAction {
    void execute();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Lights ON due to motion sensor.");
        LightAction timeOfDay = () -> System.out.println("Lights dimmed for evening mode.");
        LightAction voiceCommand = () -> System.out.println("Lights set to party mode by voice.");

        motion.execute();
        timeOfDay.execute();
        voiceCommand.execute();
    }
}
