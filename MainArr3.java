import java.util.Scanner;
class MainArr3{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = Sc.nextInt();
		System.out.println("Enter "+size+" Values");
		double ar[] = new double[size];
		for(int i = 0; i<size;i++){
			ar[i] = Sc.nextDouble();
		}
		double small = ar[0];
		//smallest one arrary value
		for(int i =1 ; i<ar.length;i++){
			if(small > ar[i]){
				small = ar[i];
				
			}		
		}
		System.out.println("smallest no is "+small);
	}
}