package game;

public class Game implements Runnable{

	public int width, height;
	private Thread gameThread;
	public String threadname;
	
	
	public Game(String title, int width, int height) {
		
		this.width = width;
		this.height = height;
		
		@SuppressWarnings("unused")
		Display displayer = new Display(title, width, height);
		// it is used >:(
		
	}


	
	public void run() {
	
	


		
	}
	
	
	
	
	
	
	}
	
	

