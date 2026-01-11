public class EvenDigits{
	public static int  evenDigits(int[] arr){
		int EvenCount=0;
		for(int i=0;i<arr.length;i++){
			int count = CountDigits(arr[i]);
			if(count%2==0){
				EvenCount++;
			}
		}
		return EvenCount;
	}
	public static int CountDigits(int num){
		int count=0;
		while(num>0){
			int digit = num%10;
			num/=10;
			count++;
		}
		return count;
	}
	
	public static int EvenDigitCount(int[] arr){
		int EvenCount=0;
		for(int num:arr){
			int count = (int)(Math.log10(num))+1;
			if(count%2==0){
				EvenCount++;
			}
		}
		return EvenCount;
	}
	public static void main(String args[]){
		int[] arr = {23,5,6,17,89};
		//System.out.print(evenDigits(arr));
		System.out.print(EvenDigitCount(arr));
	}
}



// short cut to find No.of DIgits

//(int) (Math.log10(num))+1;