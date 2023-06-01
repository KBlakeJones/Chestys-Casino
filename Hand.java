package chestysCasino;

import java.util.ArrayList;

import chestysCasino.Card.Value;

public class Hand { 
	
	private ArrayList<Card> hand;// = new ArrayList<Card>();
	private Hand hand2;
	
//	private int cards;
//	private int value;
	
	public Hand() {
		hand = new ArrayList<Card>();
		//collection of cards
		//.sublist 
	}
	
	public Hand(ArrayList<Card> cards) {
		this.hand = cards;
	}
	
	
	public void hit(Deck deck) {
		hand.add(deck.pullRandom());
		
		//add deck.next();  ???
		// getRandom() or pullRandom in deck class
		//card or deck from index 0
		//pullRandom removes card from deck so that one
		
	}
	
	public void stay() {
		// move to next hand in order
	}
	
	public void split() {
		hand = (ArrayList<Card>) hand.subList(0, 1);
		hand2 = new Hand ((ArrayList<Card>) (hand.subList(1, 2)));
		//sublist from index and to index
		// create new hand[] with each card
		// if cards at index 0 and 1 == new card[]
	}

	public int getCards() {//do we need net next for random card
		return 0;
	}
	
	public static int calculateTotalHandValue(ArrayList<Card> hand) {
		int x;
		int sum = 0;
		for(int i = 0; i < hand.size(); i++) {
		x = Card.toInt(hand.get(i).getRank());
		sum += x; 
		}
//		
//		if(hasAce()) {
//			
//		}else {
//			
//			//add sum of cards
//		}
		//acecheck
		//card.getValue
		//ace = 11 
		//if (value > 21) ace = 1 
		
		
		return sum;
	}
	
	public void resetHand() {
		hand.clear();;
		
	}
	
	public boolean hasAce() {
		if(hand.contains(Card.Value.ACE)) {
			return true;
		}
		return false;
	}
	
//	public static int toInt(Value x) {
//		switch(x) {
//		case TWO: return 2;
//		case THREE: return 3;
//		case FOUR: return 4;
//		case FIVE: return 5;
//		case SIX: return 6;
//		case SEVEN: return 7;
//		case EIGHT: return 8;
//		case NINE: return 9;
//		case TEN: return 10;
//		case JACK: return 10;
//		case QUEEN: return 10;
//		case KING: return 10;
//		case ACE: return 1;
//		default: return 0;
//		}

//	@Override
//	public String toString() {
//		return "Hand [hand=" + hand + ", cards=" + cards + ", value=" + value + "]";
//	}
	
//	public void doubleDown() {
//		bet *= 2;
//	}
	//doubleDown bet *=2; here or in 
//
//	public Hand(int cards) {
//		super();
//		this.cards = cards;
//	}
//	
//	
	
	

}
