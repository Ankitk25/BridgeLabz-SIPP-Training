package JavaStrings.Level3;

import java.util.Scanner;

public class UniqueCharacters {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static char[] findUniqueChars(String text) {
        int length = getLength(text);
        char[] result = new char[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                result[uniqueCount++] = current;
            }
        }
        char[] uniqueChars = new char[uniqueCount];
        System.arraycopy(result, 0, uniqueChars, 0, uniqueCount);
        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        char[] unique = findUniqueChars(input);
        System.out.println("Unique Characters:");
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }
}
