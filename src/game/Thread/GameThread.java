package game.Thread;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.*;

import game.States.GameState;
import game.States.State;
import gfx.Assets.Assets;
import gfx.Display.CanvasLoader;
import gfx.ImageManager.ImageLoad;
import gfx.ImageManager.SpriteSheet;


public class GameThread implements Runnable{

    public int width, height;
    private Thread gameThread;
    public String threadname;
    boolean program_running;
    String title;
    CanvasLoader displayer = new CanvasLoader();
    private BufferStrategy bs;
    private Graphics g;
    private SpriteSheet sheet;
    private State gameState; // determines if the game is on main menu, settings, or playing.



    public void run() {
        System.out.println("method run initiated");

        init(); //initializes the game from the init method

        int fps = 60;
        double tps = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;

        while (program_running) {
            now = System.nanoTime();
            delta += (now - lastTime) / tps;
            timer += now - lastTime;
            lastTime = now;

            if (delta >= 1) {
                tick();
                render();
                stopThread();
                ticks++;
                delta--;
            }
            if (timer >= 1000000000) {
                ticks = 0;
                timer = 0;

            }

            stopThread();

        }
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

        if (State.getState() != null) {

            State.getState().render(g, displayer, bs);

        }

    }







    private void init() {

        gameState = new GameState();
        State.setState(gameState);


        displayer.Displayer();
        int test1 = 0;
        Assets.init();

    }

    private void tick() {

    if (State.getState() != null) {

        State.getState().tick();

    }


    }
}


