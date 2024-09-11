import java.util.Scanner;
public class Eligibletovote {
    public static boolean  iseligible(int age){
        if(age>=18){
            return true;
        }
        return false;
   }
       
   
   public static void main(String[] args) {
       try(Scanner sc=new Scanner(System.in)){
           int age = sc.nextInt();
          System.out.println(iseligible(age));
        
       }
   }
}
