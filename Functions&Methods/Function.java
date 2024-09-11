import java.util.Scanner;

public class Function {
    public static void printMyName(String name){
        System.out.println(name);
        // return; no need to write return when writing void func

    }
        
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String name=sc.next();
            printMyName(name);//called the function
        }
    }
}
// memory stores in stack format