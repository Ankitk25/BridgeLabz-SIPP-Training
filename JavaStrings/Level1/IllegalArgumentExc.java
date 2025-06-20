package JavaStrings;
import java.util.Scanner;

public class IllegalArgumentExc {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // IllegalArgumentException
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: "+e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String text=s.nextLine();
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getClass().getSimpleName());
        }
        handleException(text);
    }

}
