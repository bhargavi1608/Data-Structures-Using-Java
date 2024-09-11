public class ClearBit {
    public static void main(String[] args) {
        int n =5;
        int pos = 2;
        int BitMask = 1<<pos;
        int not  = ~BitMask;
        int newNumber = not & n;
       System.out.println(newNumber);
        //Bit Mask =1<<i
        // Operation AND with NOT
    }
}
//1<<2
// 0001<<2
// 0100
// ~0100 = 1011
// 1011 & 0101
// 0001