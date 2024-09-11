import java.util.Scanner;
public class CheckEven {
    public static boolean checkeven (int n){
       return n%2==0;

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n=sc.nextInt();
            if(checkeven(n)){
                System.out.println(n+" is even");
            }
            else{
                System.out.println(n+" is odd");
            }
        }
    }
}
