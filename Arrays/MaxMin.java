
import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        int[] a = new int[n];
        // input
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // output
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Largest number is : "+max);
        System.out.println("Smallest number is : "+min);

       }
    }
}
