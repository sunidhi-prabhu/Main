import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array");
        int[] ans = new int[20];
        int n = in.nextInt();
        System.out.println("enter the elements of array");
        for (int i = 0; i < n; i++)
            ans[i] = in.nextInt();
        for (int i = 0; i < n; i++)
            ans[i + n] = ans[i];
        System.out.print("[");
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(ans[i]);
            if (i < 2 * n - 1)
                System.out.print(",");
            System.out.println("]");
        }
    }
}
