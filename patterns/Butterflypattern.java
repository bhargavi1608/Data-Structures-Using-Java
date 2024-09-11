
import java.util.Scanner;

public class Butterflypattern {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n= sc.nextInt();
          //upper half
          for(int i=1;i<=n;i++){
            //first part
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for (int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
          }
          //lower half
          for(int i=n;i>=1;i--){
            //first part
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for (int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
          }
        }
    }
}
