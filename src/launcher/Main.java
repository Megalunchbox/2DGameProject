package launcher;

import display.Display;
import game.Game;

public class Main {

	static Display widthGetter;
	
	
	public static void main(String[] args) {
		
	
		Game threadManager = new Game();
		threadManager.startThread();
		
		
	}

}
