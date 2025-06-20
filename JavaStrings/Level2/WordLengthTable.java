package JavaStrings.Level2;
import java.util.Scanner;

public class WordLengthTable {

    public static String[] splitWords(String text) {
        return text.split(" ");
    }

    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) word.charAt(count++);
        }
        catch (Exception e) {
            return count;
        }
    }

    public static String[][] getWordTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[][] table = getWordTable(words);
        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
