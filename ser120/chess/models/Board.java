package ser120.chess.models;

public class Board {

	private int numRows;
	private int numCols;

	private String [][] boardData;

	public Board(int rows, int cols){
		this.numRows = rows;
		this.numCols = cols;
		this.boardData = new String[this.numRows][numCols];
		initializeEmptyBoard();

	}
	
    private void initializeEmptyBoard() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                boardData[i][j] = "--";
            }
        }
    }

	public void showBoard() {
	    System.out.println("\n--- Current Chess Board ---");

	    printHorizontalDivider();

	    for (int i = 0; i < numRows; i++) {
	        System.out.print("| ");
	        for (int j = 0; j < numCols; j++) {
	            System.out.print(boardData[i][j] + " | ");
	        }
	        System.out.println(); 

	        printHorizontalDivider();
	    }
	}

	private void printHorizontalDivider() {
	    for (int k = 0; k < numCols; k++) {
	        System.out.print("-----");
	    }
	    System.out.println("-");
	}

	public boolean isSquare(){
		return numCols==numRows;
	}


	public static void main(String[] args){
		
	}
	
	public String[][] getBoardData(){
		return boardData;
	}

	public void movePiece(int fromX, int fromY, int toX, int toY) {
        boardData[toX][toY] = boardData[fromX][fromY];
        boardData[fromX][fromY] = "--";
    }


}
