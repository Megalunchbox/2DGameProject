package launcher;
import game.Thread.GameThread;

public class Launcher {


    public static void main (String []args) {


        GameThread threadManager = new GameThread();
        threadManager.startThread();


    }

}
