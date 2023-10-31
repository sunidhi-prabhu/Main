public class Sum_of_digits {
    public static void main(String[] args) {
        int m , n = 4506784;
        m = digitSum(n);
        System.out.println(m);
    }
    static int digitSum(int n){
        if (n == 0)
            return 1;
        return ((n % 10) + digitSum(n/10));
    }
}
