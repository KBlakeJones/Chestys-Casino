package chestysCasino;

public class Dealer extends Person{
	
//	private Hand hand;
//	private static final String name = "Dan Daly";
	
	Person dealer = new Person();
	
	public Dealer(String name, Hand hand) {
		this.setName("Dan Daly");
		hand = this.getHand();
//		super();
//		this.hand = new Hand();
		
	}
	
	public void dealerTurn() {
		while(dealer.getHand().calculateTotalHandValue() < 17) {
			dealer.getHand().hit(null);
		}if(getHand().calculateTotalHandValue() >= 17) {
			dealer.getHand().stay();// then checks all hands vs dealer or is dealer busts all non busts pay
		}
	}
	
	//
	//change to while (dealer.hand < 17) dealer.hit90;
	//keep calling until dealer is above 17
	//then check if(
	
//	if (dealer hand < 17) {
//		dealer.hit();
//	}else if (dealer hand >= 17 && dealer hand < 21) {
//		dealer.stay();
//	}else if (dealer hand > 21)
//		dealer.bust();

}
