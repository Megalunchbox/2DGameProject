package game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {

	private JFrame display;
	int width, height;
	String title;
	private Canvas displaycanvas;
	
	
	
	
	public Display(String title, int width, int height) {
		
		this.width = width;
		this.height = height;
		
		createDisplay();
		
	}
	
	private void createDisplay() {
		
		display = new JFrame(title);
		display.setSize(width, height);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setResizable(false);
		display.setLocationRelativeTo(null);
		display.setVisible(true);
		displaycanvas  = new Canvas();
		displaycanvas.setPreferredSize(new Dimension(width,height));
		displaycanvas.setMinimumSize(new Dimension(width,height));
		displaycanvas.setMaximumSize(new Dimension(width,height));
		
		
		
	}
	
}
