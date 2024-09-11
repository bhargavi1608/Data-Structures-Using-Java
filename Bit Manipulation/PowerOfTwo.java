public class PowerOfTwo{
    public static void main(String[] args) {
        int n =18;
        if(n>0 && (n & (n-1))==0){
             // A number is a power of 2 if it has exactly one bit set in its binary representation.
        // n & (n - 1) will be 0 only for powers of 2.
            System.out.println(n+" is the power of the 2 ");
        }else{
            System.out.println(n+" is not a power of n");
        }
    }
}