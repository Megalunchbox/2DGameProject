package game.States;


import gfx.Display.CanvasLoader;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import static gfx.Assets.Assets.title;
import static gfx.Assets.Assets.image1;
import static java.awt.Color.red;

public class MenuState extends State  {


    @Override
    public void tick() {





    }

    @Override
    public void render(Graphics g, CanvasLoader displayer, BufferStrategy bs) {

        final int width = displayer.getWidth();
        final int height = displayer.getHeight();

    g.setColor(red);
    g.fillRect(100,100,100,100);
    g.drawImage(title, 0, 0 , null);
        bs.show();
        g.dispose();


    }
}