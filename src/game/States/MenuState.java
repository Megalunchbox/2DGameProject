package game.States;


import gfx.Display.CanvasLoader;

import javax.swing.*;
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
        g.drawImage(title, 0, 0 ,null);
       // g.fillRect(width/2-150,height/2-100,150,100);
        bs.show();
        g.dispose();


    }
}