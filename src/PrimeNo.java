//prime numbers between a range of numbers

/*import java.util.Scanner;
//import static java.lang.Math.sqrt()
public class PrimeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a range of numbers to find the prime numbers");
        int flag = 0;
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a; i <= b; i++) {
            if (Isprime(i)) {
                System.out.println(i + "is prime");
                flag += 1;
            }
        }
        if (flag == 0) {
            System.out.println("no prime numbers exists");
        }
    }
    static boolean Isprime(int n){
        if(n==1||n==0||n==3||n==2)
            return false;
        for (int j = 2; j <Math.sqrt(n) ; j++) {
            if(n%2==0||n%3==0)
                return false;
        }
      return true;
    }
}*/



//sum of first n natural numbers
import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n to find sum of first n numbers");
        int n = in.nextInt();
        int a = Sum(n);
        System.out.println(a);
    }
    static int Sum(int n){
        int sum = 0;
        for (int i = 0; i <=n; i++) {
            sum += i;
        }
            return sum;
    }
}
