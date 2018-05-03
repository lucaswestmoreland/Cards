import java.util.Random;

/**
 * This is an implementation of a Card class. Used in 
 * conjunction with the deck class to build a deck of cards.
 * @author Lucas
 *
 */
public class Card {

	
	private static final int J = 11;
	private static final int Q = 12;
	private static final int K = 13;
	private static final int A = 14;
	
	public static int[] values = { 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A };
	public static String[] suits = { "DIAMOND", "HEART", "CLUB", "SPADE" };
		
	private int value;
	private String suit;


	
	/**
	 * constructor for a card object
	 * @param value
	 * @param suit
	 */
	public Card(int value, String suit) {
		boolean containsValue = false;
		boolean containsSuit = false;
		for (int i = 0; i < values.length; i++) {
			
			if(value == values[i])
				containsValue = true;
		}
		
		for (int i = 0; i < suits.length; i++) {
			
			if(suit == suits[i]) {
				containsSuit = true;
			}
		}
		
		if(containsValue && containsSuit) {
			this.value = value;
			this.suit = suit;
		}
		
		else {
			Random r = new Random();
			this.value = values[r.nextInt(12)+2];
			System.out.println(this.value);
			
			this.suit = suits[r.nextInt(4)];
			System.out.println(this.suit);
		}
		
		
	}

	/**
	 * returns the suit of a given card
	 * @param card
	 * @return String - suit
	 */
	public String getSuit(Card card) {
		return card.suit;
	}
	
	/**
	 * returns the value of a given card
	 * @param card
	 * @return int - value
	 */
	public int getValue(Card card) {
		 return card.value;
	}
	
	/**
	 * returns a string representation of a Card object
	 */
	public String toString() {

		StringBuilder string = new StringBuilder();
		string.append("[");
		switch(value) {
		case J: string.append("J");break;
		case Q: string.append("Q");break;
		case K: string.append("K");break;
		case A: string.append("A");break;
		default: string.append(value);break;}		
		string.append(", ");
		string.append(suit);
		string.append("]");
		
		return string.toString();
	}
	
	

}
