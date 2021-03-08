import java.util.Scanner;
class MainArr5{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the value of size");
		int size = Sc.nextInt();
		System.out.println("Enter "+size+" values");
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=Sc.nextInt();
		}
		int ecount=0,ocount=0;
		for(int i =0;i<arr.length;i++){
			if(arr[i]%2==0){
				ecount++;
			}
			else{
				ocount++;
			}
		}
		System.out.println("Even no is="+ecount);
		System.out.println("Odd no is="+ocount);
	}
}
