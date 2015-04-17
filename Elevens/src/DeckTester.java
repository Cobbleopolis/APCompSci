/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"ace", "number", "number", "number", "number", "number", "number", "number", "number", "number",  "jack", "queen", "king"};

		String[] suits = {"spades", "hearts", "spades", "diamond"};

		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

		Deck deck = new Deck(ranks, suits, values);

		System.out.println(deck.toString());
		deck.shuffle();
		System.out.println(deck.toString());

	}
}