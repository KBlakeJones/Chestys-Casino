package chestysCasino;

public class Player extends Person{
	
	private String name;
	//email or id  ??? serializable
	private int bet;
	private int bank;
	private Hand hand;
	private int deposit; 
	
	public Player() {
		
	}
	//setName = in.next();
	//bank setup to initial deposit
	//or just do setBank = in.next
	//deposit option resets bank 
	//so it become 
	
	public void addFunds() {
		bank += deposit;
	}
	
	public void cashOut() {
		//set bank to zero
	}
	
	public void win() {
		bank += bet;
	}
	
	public void loss() {
		bank -= bet;
	}
	
	public void blackJack() {
		bank += bet * (3/2);
	}
	
	public void bust() {
		bank -= bet;
	}
	
	public void push() {
		
	}
	
	public void doubleDown() {
		bet *= 2;
		//pulls one card 
		//so deck.next();
	}

}
