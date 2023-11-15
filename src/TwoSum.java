//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
// find two numbers such that they add up to a specific target number. using binary search



import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the size");
        int n = in.nextInt();


        int[] arr = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        System.out.println("enter the number to check sum");
        int k = in.nextInt();


        int low = 0;
        int high = n-1;
        while(low <= high){
            int sum = arr[low] + arr[high];
            if(sum == k) {
                System.out.println("[" + arr[low] + "," + arr[high] + "]");
                return;
            }

            else if (sum < k)
                low ++;

            else
                high --;

        }

    }
}



