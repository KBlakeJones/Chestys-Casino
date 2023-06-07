package chestysCasino;

public class Player extends Person{
	
	//private String name;
	//email or id  ??? serializable
	private int bet;
	private int bank;
	private Hand hand;
	private int deposit; 
	static Player b = new Player();
	
	public Player() {
		
	}
	//setName = in.next();
	//bank setup to initial deposit
	//or just do setBank = in.next
	//deposit option resets bank 
	//so it become 
	
	public void addFunds() {
		setBank(getBank() + deposit);
	}
	
	public void cashOut() {
		setBank(0);
	}
	
	public void win() {
		setBank(getBank() + bet);
		bet = 0;
	}
	
	public void loss() {
		setBank(getBank() - bet);
		bet = 0;
	}
	
	public void blackJack() {
		setBank(getBank() + bet * (3/2));
		bet = 0;
	}
	
	public void bust() {
		setBank(getBank() - bet);
		bet = 0;
	}
	
	public void push() {
		bet = 0;
	}
	
	public void doubleDown() {
		bet *= 2;
		//pulls one card 
		//so deck.next();
		bet = 0;
	}
	
	public void insurance() {
		//create hasAce method 
		//both for this and calculateHandValue method in Hand class 
		//dealer showing ace 
		//pays 2/1
		//half players bet
		//new bet?
	}

	public int getBank() {
		return bank;
	}

	public void setBank(int bank) {
		this.bank = bank;
	}

}