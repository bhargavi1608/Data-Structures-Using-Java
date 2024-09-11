
import java.util.Scanner;

// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]

public class DecimalToBinary {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
       String  binary = Integer.toBinaryString(n);
        System.out.println(binary);
    }
}
}
