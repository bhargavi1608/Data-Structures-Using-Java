import java.util.Scanner;

public class Sumofodd {
  
    public static void oddsum(int n ){
        int sum=0;
        
         for(int i=1;i<=n;i++){
            
            if(i%2!=0){
                
                sum+=i;

            }
         }
         System.out.println(sum);
    }
        
    
    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in)){
            int n = sc.nextInt();
          oddsum(n);
        }
    }
}
// memory stores in stack format