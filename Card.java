public class Card {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	private int value;
	private String name;
	
	//constructor 
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
		
	}

	//getter and setters
	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}


	public void setName(String name) {
		this.name = name;
	} 

	public String getName() {
		return name;
	}

	//Description of the card
	public void describe() {
		System.out.println(name + ": " + value);
	}

	
	
	
}
