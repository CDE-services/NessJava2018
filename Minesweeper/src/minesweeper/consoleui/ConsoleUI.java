package minesweeper.consoleui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import minesweeper.core.Field;

/**
 * Console user interface.
 */
public class ConsoleUI {
    /** Playing field. */
    private Field field;
    
    /** Input reader. */
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    /**
     * Reads line of text from the reader.
     * @return line as a string
     */
    private String readLine() {
    	try {
            return input.readLine();
        } catch (IOException e) {
        	return null;
        }
    }
    
    /**
     * Starts the game.
     * @param field field of mines and clues
     */
    public void newGameStarted(Field field) {
        this.field = field;
        System.out.printf("Ahoj %s ! %n", 
        				  System.getProperty("user.name"));
        System.out.printf("Som stalker, viem aky mas system: %s verzie %s %n%n", 
						  System.getProperty("os.name"),
						  System.getProperty("os.version"));
//        do {
            update();
            processInput();
//            this.field.openTile(0, 0);
//            update();
//            throw new UnsupportedOperationException("Resolve the game state - winning or loosing condition.");
//        } while(true);
    }
    
    /**
     * Updates user interface - prints the field.
     */
    public void update() {
    	System.out.printf("Hral si zatial %d sekund.%n%n", 
    					  field.getPlayingSeconds());
        System.out.println(field);
    }
    
    /**
     * Processes user input.
     * Reads line from console and does the action on a playing field according to input string.
     */
    private void processInput() {
        System.out.println("akoze process input");
    }
}
