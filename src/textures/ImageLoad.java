package textures;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.sun.javafx.iio.ImageLoader;

import javafx.scene.image.Image;

public class ImageLoad {

	public static BufferedImage imageLoader(String path) {
		
		try {
			return ImageIO.read(ImageLoader.class.getResource(path));
		} catch (IOException e) {
			System.out.println("Error loading image:");
			e.printStackTrace();
			System.exit(1);
		}
		
		return null;
		
	}
	
	
	
	
}
