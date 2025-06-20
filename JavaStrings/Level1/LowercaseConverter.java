package JavaStrings;

import java.util.Scanner;

public class LowercaseConverter {
    public static String toLowerCustom(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String manual = toLowerCustom(input);
        String builtIn = input.toLowerCase();

        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Match: " + compareStrings(manual, builtIn));
    }
}