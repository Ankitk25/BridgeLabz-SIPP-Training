package JavaArrays.Level1;
import java.util.*;
public class MultiplicationFrom6to9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        int[] result = new int[4];

        for (int i = 0; i < 4; i++) {
            result[i] = number * (6 + i);
            System.out.println(number + " * " + (6 + i) + " = " + result[i]);
        }
    }
}
