public class TotalPathInAMaze {
    public static int totalpath(int i,int j, int n, int m){
        if (i==n || j==m){
            return 0;
        }
        if(i==n-1 && j== m-1){
        return 1;
       }
        //move downwards
        int downpath = totalpath(i+1, j, n, m);
        //move right
        int rightpaths = totalpath(i, j+1, n, m);
        return downpath + rightpaths;
    }
    public static void main(String[] args) {
        int n=3;
        int m =3;
        System.out.println(totalpath(0, 0, n, m));
    }
}
