package JavaArrays.Level1;
import java.util.*;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int[] arr= new int[5];
        for (int i = 0; i < 5 ; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if(arr[i]>0){
                System.out.printf("Number %d is Positive\n",arr[i]);
                if (arr[i]%2==0){
                    System.out.printf("Number %d is Even\n", arr[i]);
                }
                else System.out.printf("Number %d is Odd\n",arr[i]);
            } else if (arr[i]==0) {
                System.out.printf("Number %d is Zero\n",arr[i]);
            }else {
                System.out.printf("Number %d is Negative\n",arr[i]);
            }
        }
        if(arr[0]==arr[arr.length-1]){
            System.out.printf("Number %d and %d are equals",arr[0],arr[arr.length-1]);
        }
        else System.out.printf("Number %d and %d are not equals",arr[0],arr[arr.length-1]);
    }
}
