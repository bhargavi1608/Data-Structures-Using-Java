import java.util.Scanner;
class Palindromic{
    public static void main(String[] args){
        try(Scanner sc = new Scanner (System.in)){
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // First Half Numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            // Second half
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        }
    }
}