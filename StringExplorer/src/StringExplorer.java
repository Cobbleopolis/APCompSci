/**
 * A program to allow students to try out different String methods.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer {

	public static void main(String[] args) {
		String sample = "The quick brown fox jumped over the lazy dog.";

		// Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println("sample.indexOf(\"quick\") = " + position);
		System.out.println("----------------------------------------------");
		// Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println("sample.toLowerCase() = " + lowerCase);
		System.out.println("After toLowerCase(), sample = " + sample);
		System.out.println("----------------------------------------------");
		// Demonstrate the toUpperCase method.
		String upperCase = sample.toUpperCase();
		System.out.println("sample.toUpperCase() = " + upperCase);
		System.out.println("After toLowerCase(), sample = " + sample);
		System.out.println("----------------------------------------------");
		// Demonstrate the substring(int) method.
		String substring = sample.substring(31);
		System.out.println("sample.substring(31) = " + substring);
		System.out.println("After substring(31), sample = " + sample);
		System.out.println("----------------------------------------------");
		// Demonstrate the substring(int,int) method.
		String substring2 = sample.substring(4, 19);
		System.out.println("sample.substring(4,19) = " + substring2);
		System.out.println("After substring(4,19), sample = " + sample);
		System.out.println("----------------------------------------------");
		// Demonstrate the charAt method.
		char charAt = sample.charAt(4);
		System.out.println("sample.charAt(4) = " + charAt);
		System.out.println("----------------------------------------------");
		// Demonstrate the compareTo method.
		int compareTo = sample.compareTo(new String("Hello World"));
		System.out.println("sample.compareTo(new String(\"Hello World\") = "
				+ compareTo);
		System.out.println("----------------------------------------------");
		// Demonstrate the equals method.
		boolean equals = sample.equals(sample);
		System.out.println("sample.equals(sample) = " + equals);
		System.out.println("----------------------------------------------");
		// Demonstrate the equalsIgnoreCase method.
		boolean equalsIgnoreCase = sample
				.equalsIgnoreCase(sample.toUpperCase());
		System.out.println("sample.equalsIgnoreCase(sample.toUpperCase()) = "
				+ equalsIgnoreCase);
		System.out.println("----------------------------------------------");
		// Demonstrate the length method.
		int length = sample.length();
		System.out.println("sample.length() = " + length);
		System.out.println("----------------------------------------------");
		// Demonstrate the replace method.
		String replace = sample.replace("q", "Q");
		System.out.println("sample.replace(\"q\",\"Q\") = " + replace);
		System.out.println("After replace(\"q\",\"Q\"), sample = " + sample);
		System.out.println("----------------------------------------------");
		// Demonstrate the trim method.
		String trim = sample.trim();
		System.out.println("sample.trim() = " + trim);
		System.out.println("After trim(), sample = " + sample);
		System.out.println("----------------------------------------------");
		// Demonstrate the concat method.
		String concat = sample.concat(" Hello World!");
		System.out.println("sample.concat(\" Hello World!\") = " + concat);
		System.out.println("After concat(\" Hello World!\"), sample = "
				+ sample);
		System.out.println("----------------------------------------------");
		// Demonstrate the contains method.
		boolean contains = sample.contains("Hello World!");
		System.out.println("sample.contains(\"Hello World!\") = " + contains);
		System.out.println("After contains(\"Hello World!\"), sample = "
				+ sample);
		System.out.println("----------------------------------------------");
		// Demonstrate the endsWith method.
		boolean endsWith = sample.endsWith("dog.");
		System.out.println("sample.endsWith(\"dog.\") = " + endsWith);
		System.out.println("After endsWith(\"dog.\"), sample = " + sample);
		System.out.println("----------------------------------------------");
		// Demonstrate the indexOf(str) method.
		int indexOf = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + indexOf);
		System.out.println("After indexOf(\"slow\"), sample = " + sample);
		System.out.println("----------------------------------------------");
		// Demonstrate the indexOf(str, int) method.
		int indexOf2 = sample.indexOf("the", 2);
		System.out.println("sample.indexOf(\"the\", 2) = " + indexOf2);
		System.out.println("After indexOf(\"the\", 2), sample = " + sample);
		System.out.println("----------------------------------------------");
	}

}
