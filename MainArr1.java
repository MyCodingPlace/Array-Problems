import java.util.Scanner;
class MainArr1{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = Sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter "+size+"values");
		for(int i = 0;i<size;i++){
			arr[i]=Sc.nextInt();
		}
		for(int i = arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
}
