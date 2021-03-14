class HomeAssignment{
	public static void main(String [] args){
		ArrayOpAssignment aoa = new ArrayOpAssignment();
		
		int arr[] = aoa.getArray();
		int arr1[] = aoa.getArray();
		System.out.println("Entered element in array 1");
		aoa.dispArray(arr);
		System.out.println("Entered element in array 2");
		aoa.dispArray(arr1);
		
		
		int carr[] = aoa.countEvenOdd(arr);
		System.out.println("Even Element in array ="+carr[0]+"\nOdd Element in array ="+carr[1]);
		
		System.out.println("Merged Array is");
		int narr[] = aoa.mergeArray(arr,arr1);
		aoa.dispArray(narr);
		
		System.out.println("Differnce between Biggest and smallest="+aoa.diffBetBignSmall(arr));
		
		
		System.out.println("Reverse Array is");
		int rarr[] = aoa.reverseArray(arr);
		aoa.dispArray(rarr);
	}
}
