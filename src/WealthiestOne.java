import java.util.Scanner;

public class WealthiestOne {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;


        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of bank accounts");
        int n = in.nextInt();
        int[] arr  = new int[n];
        System.out.println("enter the amount of wealth first consumer has in various acc in array format");
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
            num += arr[i];
        }



        System.out.println("enter the number of bank accounts");
        int m = in.nextInt();
        int[] array  = new int[m];
        System.out.println("enter the amount of wealth second consumer has in various acc in array format");
        for (int i = 0; i < m; i++) {
            array[i]= in.nextInt();
            sum += array[i];
        }

        if(sum>num)
            System.out.println("consumer 2 is rich");

        else
            System.out.println("consumer 1 is rich");
}
}

