
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int a = sc.nextInt();
            int b= sc.nextInt();
            char op=sc.next().charAt(0);
            switch (op) {
                case '+' -> System.out.println(a+b);
               
                case '-' -> System.out.println(a-b);
                
                case '/' ->{
                if (b==0){
                    System.out.println("Invalid Division");
                }else{
                 System.out.println(a/b);
                }
            }
               
                case '%' ->{
                if (b==0){
                    System.out.println("Invalid Division");
                }else{
                 System.out.println(a%b);
                }
            }
                
                default ->System.out.println("Invalid operator");
                
            }


        }
    }
}
