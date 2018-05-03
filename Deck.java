import java.util.ArrayList;
import java.util.Random;


/**
 * This is an implementation of a simple 52 card deck. Useful for any other
 * card game implementation.
 * @author Lucas Westmoreland
 *
 */
public class Deck {
	

	private final int startingDeckSize = 52;
	private int size;
	private ArrayList<Card> cards;
	private int count;
	
	/**
	 *  constructor for a standard 52 card deck
	 */
	public Deck() {
		size = 52;
		cards = new ArrayList<Card>(size);
		count = 0;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				Card card = new Card(Card.values[j], Card.suits[i]);
				cards.add(count, card);
				count++;	
			}
		}
	}
	
	/**
	 * removes the card that is on top of the deck
	 * @return
	 */
	public Card drawCard() {
		if(size == 0) {
			System.out.println("Cannot remove from an empty deck!");
			System.exit(0);
			
		}
		Card ret = cards.remove(0);
		size--;
		
		return ret;
	}
	
	/**
	 * @return the initial deck size we started with
	 */
	public int getStartingDeckSize() {
		return startingDeckSize;
	}
	
	/**
	 * @return the current size of the deck
	 */
	public int getCurrentDeckSize() {
		return size;
	}
	
	/**
	 * Shuffles the deck a specified amount of times
	 * @param times - the number of times this shuffle will occur
	 */
	public void shuffle(int times) {
		
		for(int i = 0; i < times; i++) {
		
	    Random r = new Random();
	    for (int j = cards.size() - 1; j > 0; j--) {
	      int index = r.nextInt(j + 1);
	      Card a = cards.get(index);
	      cards.set(index, cards.get(j));
	      cards.set(j ,a);
	    }
	    
	    i++;
	}
		
	}
	
	/**
	 * @return A string representation of the Deck of Cards
	 */
	public String toString() {
		
		StringBuilder string  = new StringBuilder();
		int count = 1;
		for(int i = 0; i < cards.size(); i++) {
			
			string.append(cards.get(i).toString());
			
			if(count % 4 != 0) {
				string.append("\t");
				count++;
			}
			else {
				string.append("\n");
				count = 1;
			}
			
			
		}
		
		return string.toString();
		
	}

}
