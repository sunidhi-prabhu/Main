public class PowerOf2 {
    public static void main(String[] args) {
        int n = 15151;//if n = 0 then it will show true optionally we can set a check for it
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
