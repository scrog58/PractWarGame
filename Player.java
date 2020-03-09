import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	//private String name2;
	private String com;
	//private Card getCard = new Card();
	
	
	
	public Player(String name) {
		 this.name = name;
		 score = 0;
	}
	
	
	public void describe() {
		System.out.println(name+"\'s hand: ");
		for(Card haveCardInHand : hand) {
			haveCardInHand.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
		
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	

}
