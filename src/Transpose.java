import java.util.Arrays;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter row and col size");
        int n = in.nextInt(), m = in.nextInt();
        int[][] a = new int[n][m];
        System.out.println("enter the ele of array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                a[i][j] = in.nextInt();
        }
        System.out.println("the matrix is "+Arrays.deepToString(a));

        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                b[j][i]=a[i][j];
        }
        System.out.println("the transposed matrix is "+Arrays.deepToString(b));
}
}

