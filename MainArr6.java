import java.util.Scanner;
class MainArr6{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = Sc.nextInt();
		System.out.print("Enter "+size+" elements");
		int arr[]=new int[size];
		for(int i =0;i<size;i++){
			arr[i]=Sc.nextInt();
		}
		int pcount=0,npcount=0;
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			boolean rs = isPrime(temp);
			if(rs == true){
				pcount++;
			}
			else{
				npcount++;
			}

		}
		System.out.println("No of Prime no="+pcount);
		System.out.println("No of Not a Prime no="+npcount);
	}
	static boolean isPrime(int n){
		for(int i =2;i<=n/2;i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
}
