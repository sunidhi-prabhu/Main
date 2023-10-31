public class num_rev {
    public static void main(String[] args) {
        int m = 12345;
        numrev(m);
        System.out.println(sum);
    }
    static int sum = 0;
    static int numrev(int m){
        if(m == 0)
            return;
        int rem = m % 10;
        sum = sum * 10 + rem;
        numrev(m/10);
    }
}
