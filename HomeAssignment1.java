import java.util.Scanner;
class HomeAssignment1{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		ArrayOperation ao = new ArrayOperation();
		int[] t = ao.readArray();
		System.out.println("Elements of an array is=");
		ao.dispArray(t);
		System.out.println("Sum of all the Elements of an array is=");
		System.out.println(ao.sumOfArray(t));
	}
}