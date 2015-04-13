/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        Card card1 = new Card("ace", "spades", 10);
        Card card2 = new Card("jack", "hearts", 5);
        Card card3 = new Card("ace", "spades", 10);
        printData(card1);
        printData(card2);
        printData(card3);
        checkEquals(card1, card2);
        checkEquals(card1, card3);
        checkEquals(card2, card3);
    }

    static void printData(Card card) {
        System.out.println("Card: " + card.toString());
        System.out.println("\tRank: " + card.rank() + "\n\tSuit: " + card.suit() + "\n\tPoint Value: " + card.pointValue());
    }

    static void checkEquals(Card card1, Card card2) {
        System.out.println("Is " + card1.toString() + " equal to " + card2.toString() + ": " + card1.matches(card2));
    }
}
