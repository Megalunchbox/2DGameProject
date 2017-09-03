package game.States;


import gfx.Display.CanvasLoader;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class GameState extends State {

    private BufferStrategy bs;

    public void tick() {



        }

    public void render(Graphics g, CanvasLoader displayer, BufferStrategy bs) {


        final int width = displayer.getWidth();
        final int height = displayer.getHeight();;



        bs = displayer.getCanvas().getBufferStrategy();
        if (bs == null){

            displayer.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();

        g.setColor(Color.red);
        g.fillArc(100, 100, 100, 150, 10, 160);
        g.fillArc(160, 170, 170, 150, 10, 160);


        bs.show();
        g.dispose();


        }


}