/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) 
    {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        Card c1 = new Card("Jack","Spade",11);
        Card c2 = new Card("King","Clubs",13);
        Card c3 = new Card("Queen","Heart",12);
        System.out.println("It should be Spade");
        c3.suit();


    }
}
