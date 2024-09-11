import java.util.Scanner;
class Strings{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            String arr[] = new String[n];
            int totlength=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.next();
                totlength+=arr[i].length();
                


            }
            System.out.println(totlength);

        }

    }
}