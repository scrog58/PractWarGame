
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numOfPlayers = 0;
		String getPlayerOneName = "";
		String getPlayerTwoName = "";
		
		Deck deck = new Deck();
		deck.shuffle();
		
		
		System.out.println("1) One Player");
		System.out.println("2) Two Players");
		System.out.println("3) Play");
		System.out.println("Welcome to the card game War!");
		System.out.print("Please Select Number Players: ");
		
		numOfPlayers = scanner.nextInt();
		
		System.out.println("You selected: " + numOfPlayers);
		
		while(numOfPlayers != 3) {
		if(numOfPlayers == 1) {
			System.out.print("Name of Player One: ");
			getPlayerOneName = scanner.nextLine();
			
			System.out.println("Welcome: " + getPlayerOneName);
			
			getPlayerTwoName = "Com";
			
		} else if(numOfPlayers == 2) {
			System.out.print("Name of Player One: ");
			getPlayerOneName = scanner.nextLine();
			
			System.out.println("Welcome: " + getPlayerOneName);
			
			System.out.println("Name of Player Two: ");
			getPlayerTwoName = scanner.nextLine();
			System.out.println("Welcome: " + getPlayerTwoName);
			
			
		} else {
			System.out.println("You didn't input how many players going to default names.");
			getPlayerOneName = "Com1";
			getPlayerTwoName = "Com2" ;
		}
	}
		
		
		Player playerOne = new Player(getPlayerOneName);
		Player playerTwo = new Player(getPlayerTwoName);
		
		
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
