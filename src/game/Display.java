package game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {

	private JFrame display;
	final int width, height;
	public String title;
	private Canvas displaycanvas;
	
	
	
	
	public Display(String title, int WIDTH, int HEIGHT) {
		
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
		this.title = title;
		createDisplay();
		
	}
	
	private void createDisplay() {
		
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
