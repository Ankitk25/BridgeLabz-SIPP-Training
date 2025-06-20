package JavaStrings;

import java.util.Scanner;

public class StrOutOfBoundsExc {
    public static void generateException(String text){
        System.out.println(text.charAt(text.length())); // Out of bounds
    }
    public static void handleException(String text){
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Caught exception in main: " + e.getClass().getSimpleName());
        }
        handleException(input);
    }
}
