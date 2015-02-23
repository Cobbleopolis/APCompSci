
public class Test {

	public static void main(String[] args) {
		LineEditor.myLine = "|Hel|lo|Hel|Hel|";
		LineEditor.deleteAll("Hel");
		System.out.println(LineEditor.myLine);
	}

}
