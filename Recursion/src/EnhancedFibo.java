import java.util.Scanner;
import static java.lang.Math.sqrt;

public class EnhancedFibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n to find fibo till n");
        int n = in.nextInt();
        System.out.println(fibo(n));
    }

    static int fibo(int n) {

        return (int) (1 / sqrt(5) * (Math.pow(((1 + sqrt(5)) / 2), n))); //suggested usage of long
    }
}
