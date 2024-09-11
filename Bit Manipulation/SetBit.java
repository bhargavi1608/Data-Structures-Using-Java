public class SetBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int BitMask = 1<<pos;
        // BitMask = 1<<i
        // Operation = OR
       
        int newNumber = BitMask | n;
        System.out.println(newNumber);
    }
}
// 1<<1
// 0001<<1
// 0010
// 0010 | 0101
// 0111 =(7) of base 10