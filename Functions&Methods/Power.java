import java.util.Scanner;

public class Power {
    public static int  Exponent(int n, int x){
        int result=1;
        for(int i=0;i<n;i++){
             result*=x;
        }
        return result;
        
        // return; no need to write return when writing void func

    }
        
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
           int x= sc.nextInt();
           int n=sc.nextInt();
           System.out.println(Exponent(n, x));
        }
    }
}
// memory stores in stack format