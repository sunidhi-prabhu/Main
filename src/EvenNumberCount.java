import java.util.Arrays;
import java.util.Scanner;

public class EvenNumberCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the ele of array");
        for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
        }
        int count = 0;
        System.out.println("the array is "+Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            String a = String.valueOf(arr[i]);
            if(a.length() % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
