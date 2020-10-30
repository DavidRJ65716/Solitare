package application.model;

import java.util.ArrayList;
import java.util.Random;

/*
 * Deck class
 */
public class Deck {
	private ArrayList<Card> deck = new ArrayList<>();
	private String[] ranks = { "a", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k" };
	private String[] suits = { "c", "d", "h", "s" };
	
	/*
	 * Initialize all card values and shuffle
	 */
	public Deck() {
		this.deck.clear();
		for( int suit = 0; suit < this.suits.length; suit++ ) {
			for( int rank = 0; rank < this.ranks.length; rank++ ) {
				Card newCard = new Card( this.suits[suit], this.ranks[rank] );
				
				this.deck.add( newCard );
			}
		}
		
		this.shuffleDeck();
	}
	
	/*
	 * remove top card
	 */
	public Card drawCard() {
		return this.deck.isEmpty() ? null : this.deck.remove( 0 );
	}
	
	/*
	 * Shuffles the deck
	 */
	private void shuffleDeck() {
		Random rand = new Random();
		
		for( int index = 0; index < this.deck.size(); index++ ) {
			int randIndex = rand.nextInt( index + 1 );
			Card a = this.deck.get( randIndex );
			Card b = this.deck.get( index );
			
			this.deck.set( randIndex, b );
			this.deck.set( index, a );
		}
	}
}
