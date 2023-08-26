import java.util.Arrays;
import java.util.Scanner;
public class PlusOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the ele of array");
        for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
        }
        System.out.println("the array is " + Arrays.toString(arr));
        for (int i = n-1; i > 0;) {
            arr[i] += 1;
            break;
            }
        System.out.println("the new array is " + Arrays.toString(arr));
    }
}
    
