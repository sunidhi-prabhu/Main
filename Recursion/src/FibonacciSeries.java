import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n to find fibo till n");
        int n = in.nextInt();
        System.out.println(fibo(n));

    }
    static int fibo(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return(fibo(n-2) + fibo(n-1));
    }
}
