package JavaStrings.Level2;

import java.util.Scanner;

public class SplitWordsComparison {

    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) text.charAt(count++);
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        int len = getLength(text);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        StringBuilder sb = new StringBuilder();
        int wordIndex = 0;
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[wordIndex++] = sb.toString();
                sb.setLength(0);
            } else {
                sb.append(ch);
            }
        }
        words[wordIndex]=sb.toString();
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] custom = splitWords(input);
        String[] builtin = input.split(" ");
        System.out.println("Match: " + compareArrays(custom, builtin));
        sc.close();
    }
}
