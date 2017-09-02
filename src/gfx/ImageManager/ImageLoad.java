package gfx.ImageManager;

import com.sun.javafx.iio.ImageLoader;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageLoad {

    public static BufferedImage imageLoader(String path) {

        try {
            return ImageIO.read(ImageLoad.class.getResource(path));
        } catch (IOException e) {
            System.out.println("Error loading image");
            e.printStackTrace();
            System.exit(1);
        }


        return null;

    }


}
