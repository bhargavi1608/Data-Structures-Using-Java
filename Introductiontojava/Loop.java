
import java.util.Scanner;


public class Loop {
    public static void main(String[] args) {
       
        // for (int i=0;i<11;i++){
        //     System.out.println(i);
        // }
       // int i=0;
    // while(i<10){
    //     i++;
    //     System.out.println(i);
    // }
//     int i=0;
//     do { 
//         System.out.println(i);
//         i++;
//     } while (i<11);
  

try(Scanner sc = new Scanner(System.in)){
    int n= sc.nextInt();
    int sum=0;
    for (int i=1;i<=n;i++){
        sum+=i;

        
    }
    System.out.println(sum);

}

    }
}
