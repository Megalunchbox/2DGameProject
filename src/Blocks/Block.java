package Blocks;


import java.awt.*;
import java.awt.image.BufferedImage;

public class Block {

    /*

    This class will probably never be changed

     */

    public static final int BLOCK_WIDTH = 32;
    public static final int BLOCK_HEIGHT = 32;

    protected BufferedImage texture;
    protected final int id;


    public Block(BufferedImage texture, int id)

    {
        this.texture = texture;
        this.id = id;


    }
    public void tick() {}

    public void render (Graphics g)

    {

  // g.drawImage(texture, x ,y ,false);


    }


    int getId () {return id;}


}