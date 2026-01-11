package methods;
public class NumberCheck {
	public static int even(int n) {
		if (n%2==0) {
			System.out.println("even");
			return 0;
		}else {
			System.out.println("odd");
			return 0;
		}
	}
	public static void main(String[] args) {
		even(20);
		even(13);
		even(22);
	}
}
