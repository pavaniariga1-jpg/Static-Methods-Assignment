package methods;
public class Calculator {
	public static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public static int sub(int a, int b) {
		int sub=a-b;
		return sub;
	}
	public static int mul(int a, int b) {
		int mul=a*b;
		return mul;
	}
	public static int div(int a, int b) {
		int div=a/b;
		return div;
	}
	public static int mod(int a, int b) {
		int mod=a%b;
		return mod;
	}
	public static void main(String[] args) {
		int a=24,  b=9;
		System.out.println("Addition of "+ a+" and "+ b+ "is:"+add(a,b));
		System.out.println("Subtraction of"+a+" and "+b+ "is:"+sub(a,b));
		System.out.println("Multiplication of"+a+" and "+b+ "is:"+mul(a,b));
		System.out.println("Division of"+a+" and "+b+ "is:"+div(a,b));
		System.out.println("Modulus of"+a+" and "+b+ " is:"+mod(a,b));
	}
	
	

}
