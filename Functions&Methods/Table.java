import java.util.Scanner;
public class Table {
    public static void table(int n){
       for(int i=1;i<=10;i++){
        System.out.println(n+" x "+i+" = "+n*i);
         

       }

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n=sc.nextInt();
            table(n);
        }
    }
}
