/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"ace", "jack", "ace"};
		String[] ranks2 = {"ace", "jack", "ace"};
		String[] ranks3 = {"ace", "jack", "ace"};

		String[] suits1 = {"spades", "hearts", "spades"};
		String[] suits2 = {"spades", "hearts", "spades"};
		String[] suits3 = {"spades", "hearts", "spades"};

		int[] values1 = {10, 5, 10};
		int[] values2 = {10, 5, 10};
		int[] values3 = {10, 5, 10};

		Deck deck1 = new Deck(ranks1, suits1, values1);
		Deck deck2 = new Deck(ranks2, suits2, values2);
		Deck deck3 = new Deck(ranks3, suits3, values3);

		System.out.println("The deck's size is " + deck1.size() + ", so the isEmpty method is " + deck1.isEmpty() + ".");
		System.out.println("The deck's size is " + deck2.size() + ", so the isEmpty method is " + deck2.isEmpty() + ".");
		System.out.println("The deck's size is " + deck3.size() + ", so the isEmpty method is " + deck3.isEmpty() + ".");
	}
}
