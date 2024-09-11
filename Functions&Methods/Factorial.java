import java.util.Scanner;

public class Factorial{
    public static void Printfact(int n){
        if (n<0){
            System.out.println("Invalid Number");
            return;
        }
         int fact=1;
         for(int i=n;i>=1;i--){
            fact*=i;
         }
         System.out.println(fact);

    }
        
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n = sc.nextInt();
            Printfact(n);
          
        }
    }
}
// memory stores in stack format
// we can call functions directly but method can be called using class objects