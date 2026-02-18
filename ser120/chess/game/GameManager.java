package ser120.chess.game;

import ser120.chess.models.CoolBoard;

public class GameManager {
	private CoolBoard board;
	
	public GameManager(){
		this.board = new CoolBoard(8,8);
	}
	
	public void runGame(){
		System.out.println("GameManager: Initializing engine...");
        board.showBoard();
        System.out.println("GameManager: Ready for Green's move.");
	
	}
	
	public CoolBoard getBoard(){
		return board;
	}
	
	
	
}


