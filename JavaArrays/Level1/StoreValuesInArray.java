package JavaArrays.Level1;
import java.util.*;
public class StoreValuesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter number (0 or negative to stop): ");
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) break;
            values[index++] = num;
        }

        for (int i = 0; i < index; i++) {
            total += values[i];
            System.out.println("Value " + (i + 1) + " = " + values[i]);
        }
        System.out.println("Sum = " + total);
    }
}
