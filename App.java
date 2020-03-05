
public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player playerOne = new Player("1");
		Player playertwo = new Player("2");
		
		deck.shuffle();
		
		
		//pull every other number for player two, other card for player one
		for(int i = 1; i < 52; i+=2) {
			playertwo.draw(deck);
//			 if((i-1) != i) {
//				playerOne.draw(deck);	 
//			 }
		
			
		}
		
		System.out.println("///////////////////////////");
		
		for(int i = 0; i < 10; i+=2) {
			System.out.println(i-1);
		}

	}
	
	

}
