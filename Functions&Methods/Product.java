import java.util.Scanner;

public class Product {
    public static int CalculateProd(int a,int b ){
         return a*b;
    }
        
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int a = sc.nextInt();
            int b= sc.nextInt();
        
          System.out.println("The product of 2 numbers is "+ CalculateProd(a, b));
        }
    }
}
// memory stores in stack format