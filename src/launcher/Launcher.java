import game.threads;


// Well im now getting used to IntelliJ and I finally sucessfuly built this class. I had to rename all the files bcuz
// i didn't know reformat code function existed.... fckme..

public class Launcher {


    public static void main (String []args) {


        threads threadManager = new threads();
        threadManager.startThread();


    }

}