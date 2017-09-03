package gfx.Display;

import gfx.Assets.Assets;
import gfx.ImageManager.SpriteSheet;
import java.awt.Graphics;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

/*

This class is not currently implemented! I plan it to be a separate class instead of the render method containing a
bunch of code that makes it kinda hard to navigate so.

*/












public class Render {

    private CanvasLoader displayer = new CanvasLoader();
    private BufferStrategy bs;
    private Graphics g;
    private BufferedImage testImage;
    private BufferedImage testImage2;
    private SpriteSheet sheet;
    int test1;
    int test2;
    public void Render () {


        final int width = displayer.getWidth();
        final int height = displayer.getHeight();;



        bs = displayer.getCanvas().getBufferStrategy();
        if (bs == null){

            displayer.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();

        g.setColor(Color.red);
        g.drawImage(Assets.image1, 20, 20 , null);


     //   if (test1 != width/10) {
       //     g.fillRect(test1 * 10, height / 2, 10, 10);
     //       test1++;
      //  }
        bs.show();
        g.dispose();


    }


}