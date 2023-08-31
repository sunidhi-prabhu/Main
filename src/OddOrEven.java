public class OddOrEven {
    public static void main(String[] args) {
        int n = 90;
        if(isOdd(n))
            System.out.println("its odd");
        else
        System.out.println("its even");
    }
    static boolean isOdd(int n){
        return (n&1)==1;

    }
}
