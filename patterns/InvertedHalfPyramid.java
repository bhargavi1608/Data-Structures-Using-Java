
import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n= sc.nextInt(); 
            for(int i=1;i<=n;i++){//rows
                for(int j=1;j<=n-i;j++){
                    //spaces
                    System.out.print(" ");
                }
                for (int k=1;k<=i;k++){ //coloumns
                        System.out.print("* ");
                    
                }
                System.out.println();
            }
        }
    }
}
