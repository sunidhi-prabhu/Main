import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SumUpTozero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the total number of ele an should have to sum to zero");
        int a = in.nextInt();
        int[] arr = new int[a];
        int b = 1;

        for (int i = 0; i < a/2; i++) {
            arr[i]= b;
            b++;
        }
        b=0;
        for (int i = a/2; i < a; i++) {
            arr[i] = -b;
            b++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
