

public class GetBit{
    public static void main(String[] args) {
        int n = 5;
        // Bit Mak : 1<<i
        // Operation : And
       int pos =3;
       int bitMask = 1<<pos;
       if((bitMask & n)==0){
        System.out.println("Bit was zero");
       }else{
        System.out.println("Bit was one");
       }

    }
}
// 0101
// 1<<3
// 0001<<3
// 1000<<3
// 1000 & 0101
// 0000
// position 3 = 0