package ser120.chess.game;

import ser120.chess.models.Board;

public class GameManager {
	private Board board;
	
	public GameManager(){
		this.board = new Board(8,8);
	}
	
	public void runGame(){
		System.out.println("GameManager: Initializing engine...");
        board.showBoard();
        System.out.println("GameManager: Ready for White's move.");
	
	}
	
	public Board getBoard(){
		return board;
	}
	
	
	
}


