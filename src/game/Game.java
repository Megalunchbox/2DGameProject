package game;

import display.Display;

public class Game implements Runnable{

	public int width, height;
	private Thread gameThread;
	public String threadname;
	boolean program_running;
	String title;
	

	
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
		System.out.println("error in main game thread");
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
	
	

