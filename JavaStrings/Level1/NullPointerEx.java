package JavaStrings;

public class NullPointerEx {
    public static void generateNullPointer() {
        String text = null;
        System.out.println(text.length());
    }
    public static void handleNullPointer() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Creating NullPointerException:");
        try {
            generateNullPointer();
        } catch (Exception e) {
            System.out.println("Exception Caught in main: " + e.getClass().getSimpleName());
        }
        System.out.println("Handling NullPointerException safely:");
        handleNullPointer();
    }
}
