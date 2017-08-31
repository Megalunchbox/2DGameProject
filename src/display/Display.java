package display;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;




public class Display {

	private JFrame display;
	private int width, height;
	private String title = "test";
	private Canvas displaycanvas;
	
	

	
	
	
	
	
	
	
	public int getWidth(int width) {
		
		this.width = width;
		return width;
		
	}
	
	public int getHeight(int height) {
		
		this.height = height;
		return width;
		
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
		display.setSize(width, height);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setResizable(false);
		display.setLocationRelativeTo(null);
		display.setVisible(true);
		displaycanvas  = new Canvas();
		displaycanvas.setPreferredSize(new Dimension(width,height));
		displaycanvas.setMinimumSize(new Dimension(width,height));
		displaycanvas.setMaximumSize(new Dimension(width,height));
		
		display.add(displaycanvas);
		display.pack();
		
		
	}
	
}
