import java.util.Scanner;
public class GCD {
  public static int gcd(int n1,int n2){
        while(n1!=n2){
            if (n1>n2){
                n1=n1-n2;
            } else{
                n2=n2-n1;
            }
        }
       return n1;

    }
        
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
       System.out.println(gcd(n1, n2));
            
          
        }
    }
}
// memory stores in stack format
// we can call functions directly but method can be called using class objects

