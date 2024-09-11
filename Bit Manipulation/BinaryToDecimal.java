
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String binary = sc.next();
            int decimal   = Integer.parseInt(binary,2);
            System.out.println(decimal);

        }
    }
}
