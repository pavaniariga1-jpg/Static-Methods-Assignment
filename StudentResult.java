package methods;
public class StudentResult {
	public static int total(int a, int b) {
		return a+b;
	}
	public static int average(int total) {
		return total/2;	
	}
	public static void main(String[] args) {
		int a=24, b=30;
		System.out.println("Total:"+total(a,b));
		System.out.println("Average of two numbers is: "+average(total(a,b)));
	}
}
