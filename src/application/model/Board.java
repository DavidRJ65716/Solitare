package application.model;

public class Board {
	Card[][] board = new Card[8][26];
	Card[][] homecell = new Card[4][13];
	Card[] freecell = new Card[4];
	int[] boardHeight = new int[8];
	
	public Board() {
		Deck deck = new Deck();
		
		for( int i = 0; i <= 7; i++ ) {
			boardHeight[i] = 7;
			
			for( int j = 0; j < 7; j++ ) {
				if( i > 3 && j == 6 ) {
					boardHeight[i] = 6;
					continue;
				}
				
				board[i][j] = deck.drawCard();
			}
		}
	}	
	
	/*
	 * Move height number of cards off bottom of src to bottom
	 * of des
	 */
	public void moveGroup( int height, int src, int des) {
		int srcHeight = boardHeight[src];
		int desHeight = boardHeight[des];
		
		for( int i = 0; i < height; i++ ) {
			board[des][desHeight+i-1] = board[src][srcHeight-i-1];
			board[src][srcHeight-i-1] = null;
		}
		
		boardHeight[src] -= height;
		boardHeight[des] += height;
	}
}
