package JavaStrings;

import java.util.Scanner;

public class NumberFormatExc {
    public static void generateException(String input) {
        int num = Integer.parseInt(input);
        System.out.println("Parsed number: " + num);
    }

    public static void handleException(String input) {
        try {
            int num = Integer.parseInt(input);
            System.out.println("Parsed: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String text= s.nextLine();
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getClass().getSimpleName());
        }
        handleException(text);
    }
}
