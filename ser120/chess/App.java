package ser120.chess;

import java.util.Scanner;
import ser120.chess.game.GameManager;

public class App {

    public void scream(){
        //
    }

    public static void main(String[] args) {
        System.out.println("--- Starting SER120 Chess App ---");
        
        //App goofy = new App();
        //App goober = new App();
        //goofy.scream();
        //goober.scream();
        //App.scream();
        //goober.scream();
        
        
        
        GameManager gm = new GameManager();
        
        
        String[][] boardData = gm.getBoard().getBoardData();
		
		boardData[0][0] = "r";
		
		
		//~ for (int i = 0; i < 8; i++) {
			//~ for (int j = 0; j < 8; j++) {
				//~ System.out.print(boardData[i][j]);
			//~ }
		//~ }

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Which piece do you want to move (Ex: A1)");
        String userInput = myScanner.next();
        System.out.println("Where do you want to move your piece? (Ex: A3)");
        gm.runGame();
        
        System.out.println("--- Session Ended ---");
    }
}
