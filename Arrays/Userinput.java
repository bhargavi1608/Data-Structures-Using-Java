
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        int[] a = new int[n];
        // input
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // output
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

       }
    }
}
