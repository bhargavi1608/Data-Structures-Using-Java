
import java.util.Scanner;

public class Count {
    
    public static void main(String[] args) {
        int positive=0,negative=0,zerores=0;
        System.out.println("Press '1' to continue and '0' to stop");
        try(Scanner sc=new Scanner(System.in)){
            int input = sc.nextInt();
            while(input==1){
                System.out.println("Enter your numbers");
                int number=sc.nextInt();
                if(number>=0){
                    positive++;
                }
                else if(number<=0){
                    negative++;

                }
                else{
                    zerores++;
                }
                System.out.println("Press '1' to continue and '0' to stop" );
                 input=sc.nextInt();
            }
            System.out.println("Positive: "+positive);
            System.out.println("negative: "+negative);
            System.out.println("Zeroes: "+ zerores);
        }
    }
}
