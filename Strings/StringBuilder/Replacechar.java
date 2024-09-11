
import java.util.Scanner;

public class Replacechar {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        String  name = sc.next();
        StringBuilder sb = new StringBuilder();
       for(int i=0;i<name.length();i++){
       if(name.charAt(i)=='e'){
            sb.append('i');
        }else{
            sb.append(name.charAt(i));
        }
       }
       System.out.println(sb);
    }
}
}
