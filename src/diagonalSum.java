import java.util.Arrays;
import java.util.Scanner;

public class diagonalSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows and col");
        int n = in.nextInt(), m = in.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("enter the ele of array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                arr[i][j] = in.nextInt();
        }
        System.out.println("the array is " + Arrays.deepToString(arr) );
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i==j)
                    sum+=arr[i][j];
                if(i + j == n-1)
                    sum+=arr[i][j];
            }
        }
        System.out.println("the diagonal sum is "+ sum);
    }
}