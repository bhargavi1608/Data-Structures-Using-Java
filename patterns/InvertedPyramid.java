
import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        }
    }
}
