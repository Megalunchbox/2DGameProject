package gfx.Assets;


import gfx.ImageManager.ImageLoad;
import gfx.ImageManager.SpriteSheet;

import java.awt.image.BufferedImage;

public class Assets {

    private final static int width32x = 32, height32x = 32; // this is a 32x sprite sheet loader so
    public static BufferedImage image1,image2,image3, title; //images to render in the first sprite sheet



public static void init() {

    title = ImageLoad.imageLoader("/textures/title1.png");
    SpriteSheet sheet = new SpriteSheet(ImageLoad.imageLoader("/textures/blocksheet.png"));
    image1 = sheet.crop(0, 0, width32x, height32x);
    image2 = sheet.crop(width32x, 0, width32x, height32x);   //so multiply every time by 32.... not a hard concept
    image3 = sheet.crop( width32x*2,0,  width32x, height32x);
}



}