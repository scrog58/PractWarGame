
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner numInput = new Scanner(System.in);
		
		int numOfPlayers = 0;
		String getPlayerOneName = "";
		String getPlayerTwoName = "";
		
		//shuffle deck
		Deck deck = new Deck();
		deck.shuffle();
		
		//find number of players
		System.out.println("Welcome to the card game War!\n");
		System.out.println("1) One Player");
		System.out.println("2) Two Players\n");
		System.out.print("Please Select Number Players: ");
		
		numOfPlayers = numInput.nextInt();
		
		
		if(numOfPlayers == 1) {
		System.out.print("Please add name of Player One: ");
		getPlayerOneName = input.nextLine();
		
		System.out.println("Welcome : " + getPlayerOneName);
		getPlayerTwoName = "Com";
		
		
		} else if(numOfPlayers == 2) {
			System.out.print("Name of Player One: ");
			getPlayerOneName = input.nextLine() + "\n";

			
			System.out.print("Name of Player Two: ");
			getPlayerTwoName = input.nextLine();
			System.out.println("Welcome: " + getPlayerOneName + " and "+ getPlayerTwoName+"\n");
			
			
		} else {
			System.out.println("You didn't input how many players going to default names.");
			getPlayerOneName = "Com1";
			getPlayerTwoName = "Com2" ;
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
		
		System.out.println(playerOne.getName() + " vs " + playerTwo.getName()+ "\n");
		
		//list the cards in hand per player
		playerOne.describe();
		System.out.println("");
		playerTwo.describe();
		
		//playing game
		for(int i = 0; i < 26;i++) {
			Card pickCardPOne = playerOne.flip();
			Card pickCardPTwo = playerTwo.flip();
		
			
			if(pickCardPOne.getValue() > pickCardPTwo.getValue()) {
				playerOne.incrementScore();
			} else if(pickCardPTwo.getValue() > pickCardPOne.getValue()) {
				playerTwo.incrementScore();
			} else {
				//both score
				System.out.println("Tie you both score");
				playerOne.incrementScore();
				playerTwo.incrementScore();
				
			}
		}
		
		
		//declare winner
		System.out.println(playerOne.getName() + " score: " + playerOne.getScore() + ", "+ playerTwo.getName()+" score: "+ playerTwo.getScore());
		if(playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("Winner: " + playerOne.getName());
		} else if(playerOne.getScore() < playerTwo.getScore()) {
			System.out.println("Winner: " + playerTwo.getName());
		} else {
			System.out.println("Tie");
		}
		
		

	}
	
	

}
