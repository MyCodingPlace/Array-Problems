import java.util.Scanner;
class ArrayAssingment1{
	int[] getArray(){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = Sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enters the elements of an array");
		for(int i =0;i<size;i++){
			arr[i]=Sc.nextInt();
		}
		return arr;
	}
	
	void dispArray(int x[]){
		for(int i =0;i<x.length;i++){
			System.out.print(x[i]+" ");
		}
	}
	
	int[] zigzagArray(int a[], int b[]){
		int c[] = new int[a.length+b.length];
		int i=0,k=0;
		while(i<a.length && i<b.length){
			c[k]=a[i];
			k++;
			c[k]=b[i];
			k++;
			i++;
		}
		while(i<a.length){
			c[k]=a[i];
			k++;
			i++;
		}
		while(i<b.length){
			c[k]=b[i];
			k++;
			i++;
		}
		return c;
	}

	int[] insertNoArray(int a[], int ele, int in){
		int c[]= new int[a.length+1];
		if(in<0 || in>a.length){
			System.out.println("Index not in the range");
			return a;
		}
		else{
			c[in] = ele;
			for(int i=0;i<a.length;i++){
				if(i<in){
					c[i]=a[i];
				}
				else{
					c[i+1]=a[i];
				}
			}
		}
		return c;
	}
	
	int[] mergeArray(int a[], int b[]){
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length){
			if(a[i]<b[j]){
				c[k++]=a[i++];
//				k++;
//				i++;
			}
			else{
				c[k++]=b[j++];
//				k++;
//				j++;
			}
		}
		while(i<a.length){
			c[k]=a[i];
			k++;
			i++;
		}
		while(i<b.length){
			c[k]=b[j];
			k++;
			j++;
		}
		return c;
	}
	
	int[] deleteNoArray(int a[],int in){
		int c[] = new int[a.length-1];
		if(in<0 || in>a.length){
			System.out.println("Index out of range");
			return a;
		}
		else{
			for(int i=0;i<a.length-1;i++){
				if(i<in){
					c[i]=a[i];
				}
				else{
					c[i]=a[i+1];
				}
			}
		}
		return c;
		
	}
	
	int[] insertArArray(int a[],int b[],int in){
		if(in<0 || in>a.length){
			System.out.println("Index not in the range");
			return a;
		}
//		else{
		int c[]= new int[a.length+b.length];
			for(int i=0;i<b.length;i++){
				c[in+i]=b[i];
			}
			for(int i=0;i<a.length;i++){
				if(i<in){
					c[i]=a[i];
				}
				else{
					c[i+b.length]=a[i];
				}
			}
//		}
		return c;
	}
	
	void freqEachArray(int ar[]){
		int n = ar.length;
		for(int i =0;i<n;i++){
			int count = 1;
			for(int j=i+1;j<n;j++){
				if(ar[i]==ar[j]){
					count++;
					ar[j]=ar[n-1];
					n--;
					j--;
				}
			}
			
			System.out.println(ar[i]+" occured="+count);
		}
	}
	
	void freqOfNumberPositive(int ar[]){
		int big=ar[0];
		for(int i=0;i<ar.length;i++){
			if(big<ar[i]){
				big=ar[i];
			}
		}
		int count[] = new int[big+1];
		for(int i=0;i<ar.length;i++){
			count[ar[i]]++;
		}
		for(int i=0;i<count.length;i++){
			if(count[i] != 0){
				System.out.println(i+" occured="+count[i]);
			}
		}
	}
	
	int countDigitOccurance(int l, int u, int x){
		int count=0;
		while(l<=u){
			int t =l;
			do{
				if(t%10 == x){
					count++;
				}
				t=t/10;
			}while(t!=0);
			l++;
		}
		return count;
	}
}