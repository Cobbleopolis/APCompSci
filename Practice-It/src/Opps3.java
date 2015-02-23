public class Opps3 {
	static double bubble;

	public static void main(String[] args) {
		bubble = 867.5309;
		double x = 10.01;
		printer(x, bubble);
	}

	public static void printer(double x, double y) {
		int z = 5;
		System.out.println("x = " + x + " and y = " + Math.floor(y/100));
		System.out.println("The value from main is: " + bubble);
		System.out.println("z = " + z);
	}
}