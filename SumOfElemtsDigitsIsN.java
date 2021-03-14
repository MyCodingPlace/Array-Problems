class SumOfElemtsDigitsIsN{
	public static void main(String [] args){
		int arr[] = {50,51,52,41,32};
		int x[] = isSumEqualsToN(arr);
		for(int i=0;i<x.length;i++){
			int num = arr[i];
			//System.out.println("Pair of number="+arr[i]);
			if(x[i]==arr.length){
				System.out.println(num+" is elements whose sum is equal to "+x.length+" i.e length of an array.");
			}
		}
		
	}
	static int[] isSumEqualsToN(int arr[]){
		int sum[] = new int[arr.length];int temp =0;
		for(int i=0;i<arr.length;i++){
			int n=arr[i];
			temp =n;
			sum[i]=0;
			do{
				int r = n%10;
				sum[i] = sum[i] + r;
				n=n/10;
			}while(n!=0);
		}
		return sum;
	}
}