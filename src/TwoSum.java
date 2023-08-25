import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter size");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the ele of array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] sum = new int[n];
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the number to check sum");
        int k = in.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == k) {
                    sum[i] = i;
                sum[j] = j;
            }
        }
        }
        System.out.println(Arrays.toString(sum));
    }
}
