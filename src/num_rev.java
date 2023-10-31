public class num_rev {
    public static void main(String[] args) {
        int n , m = 12345;
        n = numrev(m);
        System.out.println(n);
    }
    static int numrev(int m){
        if(m == 0)
            return 1;
        return (10*(m%10)) + numrev(m/10);
    }
}
