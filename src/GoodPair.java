import java.util.Arrays;
import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = in.nextInt();
        System.out.println("enter the array ele");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println(Arrays.toString(arr));
        int good = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j] && i  <  j)
                    good += 1;
            }
        }
        System.out.println("the tot good pairs are"+good);
    }
}

