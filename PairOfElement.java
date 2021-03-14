import java.util.Scanner;
class PairOfElement{
	static int[] getPair(int x[],int n){
		for(int i=0;i<x.length;i++){
			for(int j =i+1;j<x.length;j++){
				if(x[i]+x[j]== n){
					return new int[] {x[i],x[j]};
				}
			}
		}
		return null;
	}
	
	public static void main(String [] args){
		int t[] = {8,7,9,2,6,3,4};
		int a[] = getPair(t,15);
		if(a != null){
			System.out.println("Pair is there");
			for(int k =0;k<a.length;k++){
				System.out.print("a["+k+"]="+a[k]+" ");
			}
		}
		else{
			System.out.println("Pair is not found");
		} 
	}
}