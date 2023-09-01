//take n from user and perform action to change that index from 0 to 1 and if 1 keep as it is
import java.util.Scanner;

public class TurnTo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the index to turn");
        int n = in.nextInt();
        int[] arr = {1,0,0,1,1,0};
        int ans = turn(n, arr);
        System.out.println(ans);
    }
    static int turn(int n, int[] arr){
        return (arr[n] | 1);
    }
}
