package JavaStrings.Level2;

import java.util.Scanner;

public class TrimSpaces {
    public static String trimCustom(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(text.charAt(i));
        return sb.toString();
    }

    public static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String custom = trimCustom(input);
        String builtIn = input.trim();
        System.out.println("Custom Trim: '" + custom + "'");
        System.out.println("Built-in Trim: '" + builtIn + "'");
        System.out.println("Match: " + compare(custom, builtIn));
        sc.close();
    }
}

