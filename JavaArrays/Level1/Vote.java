package JavaArrays.Level1;
import java.util.*;

public class Vote {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=18){
                System.out.printf("The student with the age %d can vote\n",arr[i]);
            }
            else System.out.printf("The student with the age %d cannot vote\n",arr[i]);
        }
    }
}
