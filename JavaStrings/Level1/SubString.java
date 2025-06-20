package JavaStrings;

import java.util.Scanner;

public class SubString {
    public static String FingSubString(String str, int i, int j){
        StringBuilder sb= new StringBuilder();
        for (int k = i; k < j; k++) {
            sb.append(str.charAt(k));
        }
        return sb.toString();
    }
    public static boolean Compare(String str, String sb){
        if (str.length() != sb.length()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != sb.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter first string: ");
        String text= sc.next();
        System.out.print("enter start point: ");
        int i= sc.nextInt();
        System.out.print("enter end point: ");
        int j= sc.nextInt();
        String sub1 = FingSubString(text, i, j);
        String sub2 = text.substring(i, j);
        boolean substrCompare = Compare(sub1, sub2);
        System.out.println("Custom substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Substring comparison result: " + substrCompare);
    }
}
