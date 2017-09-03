package game.States;

import gfx.Display.CanvasLoader;

import java.awt.*;
import java.awt.image.BufferStrategy;

public abstract class State {


    private static State currentState = null;
    public static void setState(State state) {

        currentState = state;

    }

    public static State getState() {

        return currentState;

    }

    //Implement these methods
    public abstract void tick();

    public abstract void render(Graphics g, CanvasLoader displayer, BufferStrategy bs);

}