import java.util.Scanner;

public class Average{
    public static double Printavg(int a, int b, int c ){
        int sum = a+b+c;
        double avg = sum/3;
        return avg;
        
    }
   
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

           System.out.println(Printavg(a, b, c));
        }
    }
}
// memory stores in stack format
// we can call functions directly but method can be called using class objects