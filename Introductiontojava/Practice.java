import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
       try(Scanner sc= new Scanner(System.in)){
        int userinput,n;
        
        
        // for(int i=2;i<=n;i+=2){
        //     System.out.println(i);
        // }
        // for(;;){
        //     System.out.println("Bhargavi");
        // } // infinite loop
        do { 
            System.out.println("Enter 1 to  enter marks or 0 to stop");
             userinput = sc.nextInt();
             if(userinput==1){
                do{
                    System.out.println("Enter marks of the students");
                    n=sc.nextInt();
             
        if(n>=90){
            System.out.println("This is Good");
        }
        else if(n<=89 & n>=60){
            System.out.println("This is also Good");
        }
        else if(n<=59 & n>=0) {
            System.out.println("This is good as well");

        }
    }  while (n<0 || n>100);
       }
    }while (userinput!=0);
     System.out.println("Program terminated");
}
}
}
