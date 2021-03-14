import java.util.Scanner;
class ArrayOpAssignment{
	int[] getArray(){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = Sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<size;i++){
			arr[i]= Sc.nextInt();
		}
		return arr;
	}
		
	void dispArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
		
	int diffBetBignSmall(int arr[]){
		int big = arr[0], small = arr[0];
		for(int i=0;i<arr.length;i++){
			if(big < arr[i]){
				big = arr[i];
			}
			if(small > arr[i]){
				small = arr[i];
			}
		}
		return big-small;
	}
	
	int[] mergeArray(int arr[],int arr1[]){
		int n = arr.length + arr1.length;
		int narr[] = new int[n];
		 for(int i=0;i<arr.length;i++){
			narr[i]=arr[i];
		}
		for(int j=0;j<arr1.length;j++){
			narr[arr.length+j]=arr1[j];
		} 
		return narr;
	}

	int[] reverseArray(int arr[]){
		int rarr[] = new int[arr.length];
		for(int i=arr.length-1;i>=0;i--){
			rarr[i]=arr[arr.length-1-i];
		}
		return rarr;
	}
	
	int[] countEvenOdd(int arr[]){
		int carr[] = new int[2];
		int ecount=0,ocount=0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]%2==0){
				ecount++;
			}
			else{
				ocount++;
			}
		}
		carr[0]=ecount;
		carr[1]=ocount;
		return carr;
	}
	
}