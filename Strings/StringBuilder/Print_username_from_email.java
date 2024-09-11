
import java.util.Scanner;

class Print_username_from_email{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String email = sc.next();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<email.length();i++){
                if(email.charAt(i)=='@'){
                    break;
                }else{
                    sb.append(email.charAt(i));
                }
            }
            System.out.println(sb);

        }
    }
}