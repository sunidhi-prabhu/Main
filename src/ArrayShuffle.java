import java.util.Arrays;
import java.util.Scanner;

public class ArrayShuffle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int[] newarr = new int[n];
        for(int i = 0 ,j = n/2 ; i<n/2 && j<n ; i++,j++){
            newarr[i*2] = arr[i];
            newarr[i*2+1] = arr[j];
        }
        System.out.println(Arrays.toString(newarr));
    }
}
