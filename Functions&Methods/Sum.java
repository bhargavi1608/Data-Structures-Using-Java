import java.util.Scanner;

public class Sum {
    public static int CalculateSum(int a,int b ){
         int sum=a+b;
        return sum;

    }
        
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int a = sc.nextInt();
            int b= sc.nextInt();
          int sum =CalculateSum(a, b);
          System.out.println("The sum of 2 numbers is "+sum);
        }
    }
}
// memory stores in stack format