package methods;
public class MathOperation {
	public static int square(int n) {
		int Square=n*n;
		System.out.println("The Square of "+n+" is "+Square);
		return Square;
	}
	public static int cube(int n) {
		int Cube=n*n*n;
		System.out.println("The Cube of"+n+" is "+Cube);
		return Cube;
	}
	public static void main(String[] args) {
		square(7);
		cube(7);
	}

}
