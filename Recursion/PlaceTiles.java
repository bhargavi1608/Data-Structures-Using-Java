public class PlaceTiles {
    public static int placetiles(int n, int m){
       if(n==m){
        return 2;
       }
       if(n<m){
        return 1;
       }
        //vertical
        int verticalPlacement = placetiles(n-m, m);
        //horizontal
        int horizontalPlacemnt = placetiles(n-1, m);
        return verticalPlacement + horizontalPlacemnt;
    }
    public static void main(String[] args) {
        int n =4;
        int m = 2;
        System.out.println(placetiles(n, m));
    }
}
