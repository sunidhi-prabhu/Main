import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("enter an array to get the running sum");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("the array bfr sum");
        System.out.println(Arrays.toString(arr));
        int[] Run = new int[n];
       Run = Runningsum(arr,n);
        System.out.println("array after running sum");
        System.out.println(Arrays.toString(Run));

    }
    static int[] Runningsum(int[] arr,int n){
        int sum = 0;
        int [] run = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
            run[i] = sum;
        }
        return run;
    }
}
