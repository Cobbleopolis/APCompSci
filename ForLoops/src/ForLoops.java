import java.util.Scanner;

public class ForLoops {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		for(int i = name.length() - 1; i >= 0; i--){
			System.out.print(name.charAt(i));
		}
	}
}
