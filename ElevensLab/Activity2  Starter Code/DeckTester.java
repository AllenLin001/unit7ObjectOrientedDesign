/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"3", "4", "5"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck deck1 = new Deck(ranks, suits, pointValues);
        
        System.out.println("  toString:\n" + deck1.size());
        System.out.println("  isEmpty: " + deck1.isEmpty());
		System.out.println("  size: " + deck1.toString());
	}
}
