import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Rectangle r = new Rectangle();
		int len, wid;
		int rArea, rPerimeter;
		System.out.println (r);
		rArea = r.computeArea();
		rPerimeter = r.computePerimeter();
		System.out.println("The default rectangle area: " + rArea);
		System.out.println("The default rectangle perimeter: " + rPerimeter);
		System.out.println("Enter length of a rectangle: ");
		len = keyboard.nextInt();
		System.out.println("Enter width of a rectangle: ");
		wid = keyboard.nextInt();
		Rectangle r2 = new Rectangle(len, wid);
		System.out.println(r2);
		rArea = r2.computeArea();
		rPerimeter = r2.computePerimeter();
		System.out.println("Your rectangle area: " + rArea);
		System.out.println("Your rectangle perimeter: " + rPerimeter);
		r.setLength(5);
		r.setWidth(5);

		System.out.println(r);
		rArea = r.computeArea();
		rPerimeter = r.computePerimeter();
		System.out.println("The 5 x 5 rectangle area: " + rArea);
		System.out.println("The 5 x5 rectangle perimeter: " + rPerimeter);
		keyboard.close();
	}
}