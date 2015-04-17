import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = Integer.parseInt(keyboard.next());
		System.out.println(num + " is an " + EvenOrOdd.evenOrOdd(num) + " number.");
	}
}

class EvenOrOdd {

	public static String evenOrOdd(int number) {
		if(number % 2 == 1){
			return "odd";
		} else {
			return "even";
		}
	}
}