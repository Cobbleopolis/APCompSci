package base;

import java.util.Scanner;

public class InputLab {
	
	static Scanner keyboard = new Scanner(System.in);
	static int n = 12, m = 4;

	public static void main(String[] args) {
		System.out.println(m % (n + 1) * n % (m + 1));
		System.out.print("What is your first name? ");
		String firstName = keyboard.next();
		System.out.print("What is your last name? ");
		String lastName = keyboard.next();
		System.out.print("Your full name is " + firstName + " " + lastName);
	}

}
