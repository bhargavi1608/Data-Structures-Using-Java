import java.util.Scanner;

public class Fibonacci {
    public static int  fibo(int n){
        int a=0,b=1;
        System.out.println(a+" ");
        if(n>1){
            for(int i=2;i<=n;i++){
                System.out.println(b+" ");
                int temp =b;
                b=a+b;
                a=temp;
            }
            System.out.println();
        }
        return a;

    }
        
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
          
           int n=sc.nextInt();
           System.out.println(fibo(n));
        }
    }
}
// memory stores in stack format