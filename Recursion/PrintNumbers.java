public class PrintNumbers{
    public static void printNum(int n){
        if(n==6){
            return;//Base case
        }
        System.out.println(n);//print
        printNum(n+1);//Recursion
    }
    public static void main(String[] args) {
        int n=1;
        printNum(n);
    }

}