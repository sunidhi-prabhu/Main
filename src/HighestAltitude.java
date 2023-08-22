import java.util.Arrays;
import java.util.Scanner;

public class HighestAltitude {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        int large = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum > large){
                large = sum;
            }
        }
        System.out.println(large);

    }
}
