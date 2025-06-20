package JavaStrings;
import java.util.*;
public class StringCompare {
    public static boolean Compare(String s1, String s2){
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = s.next();
        System.out.print("Enter second string: ");
        String s2 = s.next();

        boolean res = Compare(s1, s2);
        boolean result = s1.equals(s2);
        System.out.println("Manual comparison result: " + res);
        System.out.println("equal() comparison result: " + result);
    }
}
