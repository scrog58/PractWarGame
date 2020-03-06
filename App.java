
public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		Player playerOne = new Player("Ezra");
		Player playerTwo = new Player("Clementine");
		
		
		//pull every other number for player two, other card for player one
		for(int i = 1; i < 52; i+=2) {
			playerTwo.draw(deck);
			 if((i-1) != i && i -1 != -1) {
				playerOne.draw(deck);	 
			 }
	
		}
		
		System.out.println(playerOne.getName() + " vs " + playerTwo.getName() );
		
		playerOne.describe();
		//playing game
		for(int i = 0; i < 26;i++) {
			Card pickCardPOne = playerOne.flip();
			Card pickCardPTwo = playerTwo.flip();
		
			
			if(pickCardPOne.getValue() > pickCardPTwo.getValue()) {
				playerOne.incrementScore();
			} else if(pickCardPTwo.getValue() > pickCardPOne.getValue()) {
				playerTwo.incrementScore();
			} else {
				System.out.println("Tie");
			}
		}
		
		
		//declare winner
		System.out.println(playerOne.getName() + "score: " + playerOne.getScore() + ","+ playerTwo.getName()+"score: "+ playerTwo.getScore());
		if(playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("Winner: " + playerOne.getName());
		} else if(playerOne.getScore() < playerTwo.getScore()) {
			System.out.println("Winner: " + playerTwo.getName());
		} else {
			System.out.println("Tie");
		}
		
		

	}
	
	

}
