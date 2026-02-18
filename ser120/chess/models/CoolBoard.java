package ser120.chess.models;

public class CoolBoard extends Board {

    // ANSI Escape Codes for Colors
    public static final String RESET = "\u001B[0m";
    public static final String GREEN_BG = "\u001B[42m";
    public static final String BLACK_BG = "\u001B[40m";
    public static final String WHITE_TEXT = "\u001B[37m";
    public static final String YELLOW_TEXT = "\u001B[33m";

    public CoolBoard(int rows, int cols) {
		super(rows, cols);
    }

    public void showBoard() {
        System.out.println(YELLOW_TEXT + "\n=== â™› CHESS ADVENTURE BOARD â™› ===" + RESET);
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                String background = ((i + j) % 2 == 0) ? GREEN_BG : BLACK_BG;
                
                String piece = this.getBoardData()[i][j];
                
                System.out.print(background + " " + piece + " " + RESET);
                
                
            }
            System.out.println();
        }
        System.out.println(YELLOW_TEXT + "================================" + RESET);
    }
    
    
}
