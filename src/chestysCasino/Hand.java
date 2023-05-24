package chestysCasino;

public class Hand { 
	
	private int cards;
	private int value;
	
	public Hand() {
		//collection of cards
	}
	
	
	public void hit() {
		//add deck.next();  ???
	}
	
	public void stay() {
		// move to next hand in order
	}
	
	public void split() {
		// create new hand with each card
	}

	public int getCards() {//do we need net next for random card
		return cards;
	}
	
	public int calculateValue() {
		return value;
	}
	
//	public void doubleDown() {
//		bet *= 2;
//	}
	//doubleDown bet *=2; here or in 

	public Hand(int cards) {
		super();
		this.cards = cards;
	}
	
	
	
	

}
