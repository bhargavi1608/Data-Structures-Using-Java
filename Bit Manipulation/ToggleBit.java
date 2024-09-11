public class ToggleBit {
    public static int toggleBit(int n, int pos) {
        // Create a bitmask with a 1 at the 'pos' position
        int mask = 1 << pos;
        // Toggle the bit at the 'pos' position
        return n ^ mask;
    }

    public static void main(String[] args) {
        int n = 29; // Example number (binary: 11101)
        int pos = 2; // Position to toggle (0-indexed from the right)

        int result = toggleBit(n, pos);
        System.out.println("Original number: " + n + " (Binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("Number after toggling bit at position " + pos + ": " + result + " (Binary: " + Integer.toBinaryString(result) + ")");
    }
}
