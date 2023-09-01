import java.util.Scanner;

public class Find_i {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,0,1};
        Scanner in = new Scanner(System.in);
        System.out.println("enter the index at which you want to find the number");
        int n = in.nextInt();
        int ans = find(n , arr);
        System.out.println(ans);
    }
    static int find (int n,int[] arr){
        return(arr[n] & (1<<(n-1)));
    }
}
