import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.println("enter the size of array");
        int n = in.nextInt();
        System.out.println("enter the elements of the array");
        for (int i = 0; i <n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            arr[i] = arr[arr[i]];
        }
        for (int i = 0; i <n; i++) {
            System.out.println(arr[i]);
        }
    }
}
