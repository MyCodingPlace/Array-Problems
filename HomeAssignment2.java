import java.util.Scanner;
class HomeAssignment2{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		ArrayAssingment1 obj = new ArrayAssingment1();
		int x[] = obj.getArray();
 		int x1[] = obj.getArray();
		System.out.println("Array elements are");
 		obj.dispArray(x);
 		System.out.println();
		obj.dispArray(x1);
		System.out.println();
		 
		int[] x2 = obj.zigzagArray(x,x1);
		System.out.println("ZigZag Array elements are");
		obj.dispArray(x2);
		System.out.println();
		
		System.out.println("Insert Number in array");
		System.out.println("Enter element");
		int ele = Sc.nextInt();
		System.out.println("Enter index position");
		int in1 = Sc.nextInt();
		int[] x3 = obj.insertNoArray(x, ele, in1);
		obj.dispArray(x3);
		System.out.println();

		System.out.println("Merge Array elements are");
		int[] x4 = obj.mergeArray(x,x1);
		obj.dispArray(x4);
		System.out.println();
		
		System.out.println("Delete Array elements are");
 		System.out.println("Enter index  you want to delete");
 		int num1 = Sc.nextInt();
		int[] x5 = obj.deleteNoArray(x, num1);
		obj.dispArray(x5);
		System.out.println();
	 	
 		System.out.println("Insert Array elements into Array");
		System.out.println("Enter the index value where you want to insert arry");
		int in = Sc.nextInt();
		int[] x6 = obj.insertArArray(x,x1,in);
		obj.dispArray(x6);
		System.out.println();
		
		System.out.println();
		obj.freqEachArray(x);
		System.out.println();
		obj.freqOfNumberPositive(x);
		System.out.println();
		System.out.println("2 in b/w 20 to 25="+ obj.countDigitOccurance(20,25,2));
	}
}
