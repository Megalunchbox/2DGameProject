package display;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;




public class Display {

	private JFrame display;
<<<<<<< HEAD:src/display/Display.java
	private int width, height;
	private String title = "test";
=======
	final int width, height;
	public String title;
>>>>>>> origin/master:src/game/Display.java
	private Canvas displaycanvas;
	
	

	
	
	
	
	
	
<<<<<<< HEAD:src/display/Display.java
	
	public int getWidth(int width) {
		
		this.width = width;
		return width;
		
	}
	
	public int getHeight(int height) {
		
		this.height = height;
		return width;
=======
	public Display(String title, int WIDTH, int HEIGHT) {
		
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
		this.title = title;
		createDisplay();
>>>>>>> origin/master:src/game/Display.java
		
	}
	
	public String getTitle() {
		
		return title;
		
	}
	
	public void Displayer() {
		createDisplay();
		System.out.println("Display created from display.Display");
	}
	
	private void createDisplay() {
		
		getWidth(500);
		getHeight(500);
		
		display = new JFrame(title);
		display.setSize(WIDTH, HEIGHT);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setResizable(false);
		display.setLocationRelativeTo(null);
		display.setVisible(true);
		displaycanvas  = new Canvas();
		displaycanvas.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		displaycanvas.setMinimumSize(new Dimension(WIDTH,HEIGHT));
		displaycanvas.setMaximumSize(new Dimension(WIDTH,HEIGHT));
		
		display.add(displaycanvas);
		display.pack();
		
		
	}
	
}
