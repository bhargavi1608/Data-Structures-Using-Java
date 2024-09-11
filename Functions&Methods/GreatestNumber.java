import java.util.Scanner;
public class GreatestNumber {
    public static int greatest(int a, int b){
       if(a>b){
       return a;
       }
       else{
       return b;
       }

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int a=sc.nextInt();
            int b= sc.nextInt();
            System.out.println(greatest(a, b));
           
        }
    }
}
