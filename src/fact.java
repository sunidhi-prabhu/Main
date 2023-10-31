public class fact {
    public static void main(String[] args) {
        int m, n = 5;
       m = fact(n);
        System.out.println(m);
    }

    static int fact(int n){
        if(n==1)
            return 1;
        return (n * fact(n-1));
    }
}
