import java.util.Scanner;
class ArrayOperation{
	int[] readArray(){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = Sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter "+size+" elements");
		for(int i = 0;i<size;i++){
			arr[i]=Sc.nextInt();
		}
		return arr;
	}
	
	void dispArray(int arr[]){
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	int sumOfArray(int []arr){
		int sum =0;
		for(int i=0;i<arr.length;i++){
			sum =sum+arr[i];
		}
		return sum;
	}
	
}
