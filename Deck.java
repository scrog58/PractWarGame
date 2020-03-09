import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {
	
	//pull names in list to shuffle deck
	private int value;
	private String name;
	private String getSuits;
	
	private String[] suits = {"Heart", "Diamonds", "Spades", "Clubs"};
	private String[] getName = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
	
		List<Card> cards = new ArrayList<Card>();

		public Deck() {
			
			for(int i = 2; i < getName.length + 2; i++) {
				for(int j = 0; j < suits.length; j++) {
					String getSuits = getName[i-2] + " of " + suits[j];
					cards.add(new Card(getSuits,i));
				}
				
				
			}
			
			
			name = getSuits;

		}		


	
	public void describe() {
		for(Card card: cards) {
			card.describe();
		}
	}

	
	//shuffle the deck
	public void shuffle(){
		Collections.shuffle(cards);

	}
	
	

	public Card draw() {
		return cards.remove(0);
	}
	

}
