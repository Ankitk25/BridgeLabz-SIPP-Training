package JavaStrings.Level2;

import java.util.Scanner;

public class VowelConsonantCount {
    public static String getType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch += 32;
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] countVC(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                String type = getType(ch);
                if (type.equals("Vowel")) vowels++;
                else if (type.equals("Consonant")) consonants++;
            } catch (Exception e) {
                break;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] result = countVC(input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
        sc.close();
    }
}
