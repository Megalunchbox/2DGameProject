package game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.*;
import display.CanvasLoader;
import textures.ImageLoad;



public class threads implements Runnable{

    public int width, height;
    private Thread gameThread;
    public String threadname;
    boolean program_running;
    String title;
    CanvasLoader displayer = new CanvasLoader();
    private BufferStrategy bs;
    private Graphics g;
    private BufferedImage testImage;





    public void run() {
        System.out.println("method run initiated");
        init();
        while(program_running)
        {
            tick();
            render();

        }








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

        displayer.getHeight();
        displayer.getWidth();




        bs = displayer.getCanvas().getBufferStrategy();
        if (bs == null){

            displayer.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();

        g.setColor(Color.red);
        g.fillRect(10,10,100,100);
        g.drawImage(testImage, 20, 20 , null);
        bs.show();
        g.dispose();
    }







    private void init() {


        displayer.Displayer();
        testImage = ImageLoad.imageLoader("sky.png");
    }








    private void tick() {




    }
}


