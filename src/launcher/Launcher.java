package launcher;
import game.Thread.GameThread;


// Well im now getting used to IntelliJ and I finally sucessfuly built this class. I had to rename all the files bcuz
// i didn't know reformat code function existed.... fckme..

public class Launcher {


    public static void main (String []args) {


        GameThread threadManager = new GameThread();
        threadManager.startThread();


    }

}