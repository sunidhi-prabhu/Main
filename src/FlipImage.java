import java.util.Arrays;
import java.util.Scanner;

public class FlipImage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the row and column size");
        int n = in.nextInt(),m = in.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("enter the ele of array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                arr[i][j] = in.nextInt();
        }
        System.out.println("the given array is");
        System.out.println(Arrays.deepToString(arr));
        int[][] rra = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rra[i][j]=arr[i][m - j -1];
                if(rra[i][j]==0)
                    rra[i][j]=1;
                else if (rra[i][j]==1)
                    rra[i][j]=0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(rra[i][j]+" ");
            }
            System.out.println( );
        }
    }
}



