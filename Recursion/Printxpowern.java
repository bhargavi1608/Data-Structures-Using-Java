public class Printxpowern {
    public static int calpow(int x, int n){
        if(n==0){ //base case
            return 1;
        }
        if(x==0){//base case
            return 0;
        }
         int xpownm1 =calpow(x, n-1);//work
         int xpown = x*xpownm1;
         return xpown;

    }
    public static void main(String[] args) {
        int x=2,n=5;
         System.out.println(calpow(x, n));
    }
}
