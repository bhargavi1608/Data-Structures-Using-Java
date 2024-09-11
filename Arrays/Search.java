
import java.util.Scanner;

public class Search{
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        int[] a = new int[n];
        // input
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        // output
        for(int i=0;i<a.length;i++){
           if (a[i]==x){
            System.out.println("x found at index : "+1);
           }
        }

       }
    }
}
