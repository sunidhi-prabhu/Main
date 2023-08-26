import java.util.Arrays;
import java.util.Scanner;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] newArray = new int[n];
        System.out.println("enter the ele of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("the array is " + Arrays.toString(arr));
        int newsize = 0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]!=arr[i+1]){
                newArray[newsize]=arr[i];
                newsize++;
            }
        }
        newArray[newsize] = arr[n - 1];
        newsize++;
        System.out.println("the new array is "+ Arrays.toString(newArray) + "the tot ele within it is "+ newsize);
    }
}
