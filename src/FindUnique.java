public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1 , 1, 2, 2, 4, 6 ,6};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;
        for(int n:arr)
        unique^=n;
        return unique;
    }
}
