public class SetBits {
    public static void main(String[] args) {
        int n = 687;
        System.out.println(Integer.toBinaryString(n));
        int count = 0;

        while(n > 0){
            count++;
            n -= (n & -n);
        }
        System.out.println(count);
    }
}
