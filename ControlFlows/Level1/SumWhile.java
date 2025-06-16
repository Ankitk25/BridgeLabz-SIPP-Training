package ControlFlows.Level1;

import java.util.*;

public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("Sum by while loop: " + sum);
            System.out.println("Sum by formula: " + formula);
        } 
    }
}
