
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        int[] a = new int[n];
        // input
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // output
        boolean isAscending=true;

        for(int i=0;i<a.length-1;i++){ // NOTICE a.length-1 as termination condition
            if(a[i]>a[i+1]){// This the condition for ascending order
              isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("The array is sorted in ascending order");
        }
        else{
            System.out.println("The array is not  sorted in ascending order");
        }

       }
    }
}
