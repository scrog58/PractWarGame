import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {

	
		
	//pull info from Map in card
	//Map<Card, Card> getTheCards = new HashMap<Card, Card>();
	
	//pull names in list to shuffle deck
	private int value;
	private String name;
	
	//Values of the cards	
			private int[] findValues = {
					2
					,3
					,4
					,5
					,6
					,7
					,8
					,9
					,10
					,11
					,12
					,13
					,14};

			//name of the cards
			private String[] findNames = {
					"Ace of Hearts"
					,"Ace of Diamonds"
					,"Ace of Spades"
					,"Ace of Clubs"
					,"Jack of Hearts"
					,"Jack of Diamonds"
					,"Jack of Spades"
					,"Jack of Clubs"
					,"Queen of Hearts"
					,"Queen of Diamonds"
					,"Queen of Spades"
					,"Queen of Clubs"
					,"King of Hearts"
					,"King of Diamonds"
					,"King of Spades"
					,"King of Clubs"
					,"Two of Hearts"
					,"Three of Hearts"
					,"Four of Hearts"
					,"Five of Hearts"
					,"Six of Hearts"
					,"Seven of Hearts"
					,"Eight of Hearts"
					,"Nine of Hearts"
					,"Ten of Hearts"
					,"Two of Diamonds"
					,"Three of Diamonds"
					,"Four of Diamonds"
					,"Five of Diamonds"
					,"Six of Diamonds"
					,"Seven of Diamonds"
					,"Eight of Diamonds"
					,"Nine of Diamonds"
					,"Ten of Diamonds"
					,"Two of Spades"
					,"Three of Spades"
					,"Four of Spades"
					,"Five of Spades"
					,"Six of Spades"
					,"Seven of Spades"
					,"Eight of Spades"
					,"Nine of Spades"
					,"Ten of Spades"
					,"Two of Clubs"
					,"Three of Clubs"
					,"Four of Clubs"
					,"Five of Clubs"
					,"Six of Clubs"
					,"Seven of Clubs"
					,"Eight of Clubs"
					,"Nine of Clubs"
					,"Ten of Clubs"
					};
			
			
		Map<String, Integer> deckOfCards = new HashMap<String, Integer>();
		List<Card> cards = new ArrayList<Card>();

		public Deck() {
			
			for(int i = 0; i < findValues.length; i++) {
				for(int j = 0; j < findNames.length; j++) {
						if(findNames[j].contains("Ace") && findValues[i] == 14){
					//System.out.println(names[j]+": "+values[i]);
							deckOfCards.put(findNames[j], findValues[i]);
						}  else if(findNames[j].contains("King") && findValues[i] == 13){
							deckOfCards.put(findNames[j], findValues[i]);
						} else if(findNames[j].contains("Queen") && findValues[i] == 12){
							deckOfCards.put(findNames[j], findValues[i]);
						} else if(findNames[j].contains("Jack") && findValues[i] == 11){
							deckOfCards.put(findNames[j], findValues[i]);
						}  else if(findNames[j].contains("Ten") && findValues[i] == 10){
							deckOfCards.put(findNames[j], findValues[i]);
						} else if(findNames[j].contains("Nine") && findValues[i] == 9){
							deckOfCards.put(findNames[j], findValues[i]);
						} else if(findNames[j].contains("Eight") && findValues[i] == 8){
							deckOfCards.put(findNames[j], findValues[i]);
						} else if(findNames[j].contains("Seven") && findValues[i] == 7){
							deckOfCards.put(findNames[j], findValues[i]);
						}  else if(findNames[j].contains("Six") && findValues[i] == 6){
							deckOfCards.put(findNames[j], findValues[i]);
						} else if(findNames[j].contains("Five") && findValues[i] == 5){
							deckOfCards.put(findNames[j], findValues[i]);
						} else if(findNames[j].contains("Four") && findValues[i] == 4){
							deckOfCards.put(findNames[j], findValues[i]);
						} else if(findNames[j].contains("Three") && findValues[i] == 3){
							deckOfCards.put(findNames[j], findValues[i]);
						} else if(findNames[j].contains("Two") && findValues[i] == 2){
							deckOfCards.put(findNames[j], findValues[i]);
						} 
						
				}
			 }
			name = deckOfCards.keySet().toString();
			
			
			for(String suit: deckOfCards.keySet()) {
				cards.add(new Card(suit, deckOfCards.get(suit)));
				
			}

		}		


	
	public void describe() {
		for(Card card: cards) {
			card.describe();
		}
	}

	
//	public Deck() {
//		for(Card deck : getTheCards.keySet()) {
//			cards.add(deck);
//		}
//	}
	
	//shuffle the deck
	public void shuffle(){
		Collections.shuffle(cards);

	}
	
	

	public Card draw() {
		return cards.remove(0);
	}
	

}
