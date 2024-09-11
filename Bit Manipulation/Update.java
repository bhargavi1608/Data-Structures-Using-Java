
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        try(Scanner sc = new Scanner(System.in)){
        int oper= sc.nextInt(); // update bit to 1 else update bit to 0
        /*For 0
        Bit Mask = 1<<i
        Operation : AND with NOT //Clear
        For 1
        Bit Mask = 1<<i
        Operation : OR */ //Set operation
      
        int BitMask = 1<<pos;
        if(oper==1){
        int newNumber = BitMask| n; 
        System.out.println(newNumber);
        } else{
            int newBitMask = ~(BitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
}
// 0101
// BitMask =1<<1
// 0001<<1
// 0010
// 0010 | 0101
// 0111

// BitMask 1<<2
// 0001<<2
// 0100 
// ~0100
// 1011
// 1011 & 0101
// 0001