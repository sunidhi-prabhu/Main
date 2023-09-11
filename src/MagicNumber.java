public class MagicNumber{
    public static void main(String[] args) {
        int n = 10;
        int base = 5;
        int ans = 0;
        while ( n > 0){
            int last = n & 1;
            n >>= 1;
            ans += base * last;
            base *= 5;
        }
        System.out.println(ans);
    }
}
