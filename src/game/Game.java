package game;

public class Game implements Runnable{

	public final int width, height;
	private Thread gameThread;
	public String threadname;
	boolean program_running;
	
	public Game(String title, int width, int height) {
		
		this.width = width;
		this.height = height;
		
		@SuppressWarnings("unused")
		Display displayer = new Display(title, width, height);
		
	}


	
public synchronized void startThread() { 
	
	gameThread = new Thread();
	
	gameThread.start();
	
	program_running = true;
}

public synchronized void stopThread() {
	
	
	if (program_running = true) {
		
		return;
	}
	
	try {
		gameThread.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
		System.out.println("main thread exception!");
		gameThread.sleep(1000);
	}
	
	
	
}


private void render() { 
	
	

}


private void init() {
	
	
	
}

private void tick() {
	
	
	
	
}
	
public void run() {
	
	init();
	
	tick();


		
	}
	
	
	
	
	
	
	}
	
	

