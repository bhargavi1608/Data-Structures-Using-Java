
import java.util.Scanner;

public class Combinedlength {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int n = sc .nextInt();
        StringBuilder sb = new StringBuilder();
        String str[]= new String[n];
        
        for(int i=0;i<n;i++){
            str[i]=sc.next();
            sb.append(str[i]);

        }
       System.out.println(sb.length());
    }
    }
}
