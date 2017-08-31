package game;

public class Game {

	public int width, height;
	
	
	public Game(String title, int width, int height) {
		
		this.width = width;
		this.height = height;
		
		Display displayer = new Display(title, width, height);
		
		
		
	}
	
	
}
