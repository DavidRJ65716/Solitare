package application.model;

/*
 * Card class, container for data
 */
public class Card {
	private String suit;
	private String rank;
	private String color;
	
	public Card( String suit, String rank ) {
		this.suit = suit;
		this.rank = rank;
		this.color = ( suit.equals("d") || suit.equals("h") ? "red" : "black" );
	}
}
