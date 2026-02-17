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

       gm.runGame();

        while(true){
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Which piece do you want to move? (Ex: A1) ");
            String userMove = myScanner.next();
            System.out.print("Where do you want to move that piece? (Ex: A2) ");
            String userPlace = myScanner.next();

            gm.runGame();

            System.out.print("Do you want to keep playing or exit? ");
            String userEnd = myScanner.next();
            if(userEnd.equals("exit")){
                System.out.println("Goodbye");
                System.out.println("--- Session Ended ---");
                gm.runGame();
                System.exit(1);
            }else{
                gm.runGame();
            }
        }
    }
}