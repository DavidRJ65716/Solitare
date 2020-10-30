package application.model;

public class Board {
	Card[][] board = new Card[8][26];
	Card[][] homecell = new Card[4][13];
	Card[] freecell = new Card[4];
	
	public Board() {
		Deck deck = new Deck();
		
		deck.shuffleDeck();
		for( int i = 0; i < 7; i++ ) {
			for( int j = 0; j < 7; j++ ) {
				if( i > 3 && j == 6 ) {
					continue;
				}
				
				board[i][j] = deck.drawCard();
			}
		}
	}	
}
