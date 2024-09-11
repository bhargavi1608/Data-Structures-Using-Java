import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            float r =sc.nextFloat();
            double area = 3.14*r*r;
            System.out.println(area);
        }
    }
}
