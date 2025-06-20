package JavaStrings.Level2;

import java.util.Scanner;

public class ShortestLongestWord {
    public static String[] splitWords(String text) {
        return text.split(" ");
    }

    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) word.charAt(count++);
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] getMinMax(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (getLength(word) < getLength(shortest)) shortest = word;
            if (getLength(word) > getLength(longest)) longest = word;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[] result = getMinMax(words);
        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
        sc.close();
    }
}

