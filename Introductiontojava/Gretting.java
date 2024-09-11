
import java.util.Scanner;

public class Gretting {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int button=sc.nextInt();
            // if(button==1){
            //     System.out.println("Hello");
            // }
            // else if (button==2){
            //     System.out.println("Namaste");

            // }
            // else if(button==3){
            //     System.out.print("Bonjour");

            // }
            // else{
            //     System.out.println("You have entered invalid button");
            // }
            // using switch
            switch (button) {
                case 1 -> System.out.println("Hello");
                case 2 -> System.out.println("Namaste");
                case 3 -> System.out.println("Bonjour");
                default -> System.out.println("Invalid button");
            }

        }
    }
}
