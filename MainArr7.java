import java.util.Scanner;
class MainArr7{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = Sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter "+size+"values");
		for(int i = 0;i<size;i++){
			arr[i]=Sc.nextInt();
		}
		int pcount =0, ncount=0, wcount=0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>0){
				pcount++;
			}
			else if(arr[i]<0){
				ncount++;
			}
			else if(arr[i]==0){
				wcount++;
			}
		}
		System.out.println("positive no ="+pcount);
		System.out.println("negative no ="+ncount);
		System.out.println("whole no="+wcount);
	}
}
