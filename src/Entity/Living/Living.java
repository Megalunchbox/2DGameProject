package Entity.Living;
import Entity.Entity;

import java.awt.*;

public abstract class Living extends Entity {

    int health;
    public Living(float x, float y) {

        super(x, y);
        health = 10;
    }

    public void render(Graphics g) {




    }

}