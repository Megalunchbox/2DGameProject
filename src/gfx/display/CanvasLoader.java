package gfx.Display;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;


public class CanvasLoader {


    private JFrame display;
    private String title = "2DGameProject - indev ";
    private Canvas displaycanvas;



    public Canvas getCanvas() {
        return displaycanvas;
    }
    public int getWidth() {
        int width = 1280;
        return width;
    }
    public int getHeight() {
        int height = 720;
        return height;
    }
    public String getTitle() {
        return title;
    }
    public void Displayer() {
        createDisplay();
        System.out.println("Display created from display.Display");
    }
    private void createDisplay() {
        final int height = getHeight();

        final int width = getWidth();
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
