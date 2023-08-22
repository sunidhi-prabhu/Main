import java.util.Arrays;
import java.util.Scanner;

public class SmallerNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size");
        int n = in.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        int[] rra = new int[n];
        System.out.println("enter the ele of array");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                if (j != i && arr[i] > arr[j])
                    sum ++;
            }
            rra[i]=sum;
        }
        System.out.println("the new array is");
            System.out.println(Arrays.toString(rra));
        }
    }

