package game;

import display.Display;

public class Game implements Runnable{

	public final int WIDTH, HEIGHT;
	private Thread gameThread;
	public String threadname;
	boolean program_running;
	String title;
	
<<<<<<< HEAD
=======
	public Game(String title, final int WIDTH, final int HEIGHT) {
		
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
		
		@SuppressWarnings("unused")
		Display displayer = new Display(title, WIDTH, HEIGHT);
		
	}

>>>>>>> origin/master

	
public synchronized void startThread() { 
	
	gameThread = new Thread();
	System.out.println("game thread started");
	gameThread.start();
	program_running = true;
	run();
}

public synchronized void stopThread() {
	
	
	if (program_running = true) {
		
		return;
	}
	
	try {
		gameThread.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
<<<<<<< HEAD
		System.out.println("error in main game thread");
=======
		System.out.println("main thread exception!");
		gameThread.sleep(1000);
>>>>>>> origin/master
	}
	
	
	
}


private void render() { 
	
	

}


private void init() {
	
	Display displayer = new Display();
	displayer.Displayer();
}

private void tick() {
	
	
	
	
}
	
public void run() {
	System.out.println("method run initiated");
	init();
	while(program_running)
	{
	tick();
	render();
	}
		
	}
	
	
	
	
	
	
	}
	
	

