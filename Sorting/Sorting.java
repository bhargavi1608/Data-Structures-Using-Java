public class Sorting{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    // time complexity =O(n^2)
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        // bubble part
        for(int i=0;i<arr.length-1;i++){ //n-1
            for(int j =0;j<arr.length-i-1;j++){ 
                if(arr[j]> arr[j+1]){
                    //swap
                   int  temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
printArray(arr);
    }
}