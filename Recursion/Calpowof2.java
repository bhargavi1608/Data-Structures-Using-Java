public class Calpowof2 {
    public static int calpow(int x, int n){
        if(n==0){ //base case
            return 1;
        }
        if(x==0){//base case
            return 0;
        }
         //if n is even
         if(n%2==0){
            return calpow(x, n/2)*calpow(x, n/2);

         }else{//n is odd
            return calpow(x,n/2)*calpow(x, n/2)*x;
         }

    }
    public static void main(String[] args) {
        int x=2,n=5;
         System.out.println(calpow(x, n));
    }
}
