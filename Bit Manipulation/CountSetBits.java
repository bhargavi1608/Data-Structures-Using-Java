 public class CountSetBits {
    public static int countOnes(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); // Clear the lowest set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 29; // Example number (binary: 11101)
        int result = countOnes(n);
        System.out.println("Number of 1's in binary representation of " + n + " (" + Integer.toBinaryString(n) + ") is: " + result);
    }
}
 
    

