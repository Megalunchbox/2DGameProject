package game;

import java.util.Random;

public class Math {


    public static boolean isBetween(float x1, float y1, float x2, float y2, float objeX, float objeY) {
        if ((x1 <= objeX && x2 >=objeX) || (x1 >=objeX && x2<=objeX )) {
            if ((y1 <= objeY && y2 >=objeY) || (y2 <= objeY && y1 >=objeY))
                return true;
        }
        else {
            return false;
        }
        return false;
    }

    public static void randomNumber (int x)

    {

        Random rand = new Random();

        int  n = rand.nextInt(x) + 1;

    }

}