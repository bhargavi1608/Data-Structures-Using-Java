
import java.util.Scanner;

class Areaofcircle{
    public static double calculatearea(int r){
        return 2*3.14*r;

    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            int r = sc.nextInt();
            System.out.println(calculatearea(r));

        }
    }
}