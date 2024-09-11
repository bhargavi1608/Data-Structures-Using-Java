import java.util.Scanner;

public class Prime {
    public static boolean  Checkprime(int n){
         if (n<=1){
          return false;
        }
        for(int i=2;i<n;i++)
            if(n%i==0)
            return false; // if divisible ,its not prime

        return true;// if no divisor is found it is prime
    }
        
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n = sc.nextInt();
            if(Checkprime(n)){
                System.out.println(n+" is a prime");
            }
            else{
                System.out.println(n+" not a prime");
            }
         
        }
    }
}
// memory stores in stack format