package JavaStrings;

import java.util.Scanner;

public class CustomToCharArray {
    public static char[] stringToCharArray(String text){
        char[] res=new char[text.length()];
        for (int i=0;i<res.length;i++){
            res[i]=text.charAt(i);
        }
        return res;
    }
    public static boolean compareStrArray(char[] c1, char[] c2){
        if (c1.length != c2.length) return false;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("enter string:");
        String text =s.next();
        char[] custom = stringToCharArray(text);
        char[] builtIn=text.toCharArray();
        boolean result=compareStrArray(custom,builtIn);
        System.out.println("Custom Array: "+ new String(custom));
        System.out.println("Built-in Array: "+ new String(builtIn));
        System.out.println("Compare char array: "+result);
    }
}
