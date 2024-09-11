
import java.util.Scanner;
public class Printname{
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        String[] a = new String[n];
        // input
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
       
        // output
        for(int i=0;i<a.length;i++){
            System.out.println("name " + (i+1) +" is : " + a[i]);
           
        }

       }
    }
}
