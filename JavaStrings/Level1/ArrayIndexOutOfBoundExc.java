package JavaStrings;

import java.util.Scanner;

public class ArrayIndexOutOfBoundExc {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]); // Out of bounds
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < 3; i++) {
            names[i] = s.nextLine();
        }
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getClass().getSimpleName());
        }
        handleException(names);
    }
}
