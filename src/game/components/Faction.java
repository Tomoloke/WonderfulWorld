package game.components;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Faction {
	
	public BufferedImage image;
	
	public String production;
	public int victoryPoints;
	public char victoryPointsMultiplier;
	
	public Faction(String imagePath, String production, int victoryPoints, char victoryPointsMultiplier) {
		super();
		File file = new File("res/" + imagePath);
		try {
			image = ImageIO.read(file);
			//image = ImageIO.read(Image.class.getResourceAsStream(imagePath));
		} catch (IOException e) {
			System.out.println("Not found: " + imagePath);
		}
		this.production = production;
		this.victoryPoints = victoryPoints;
		this.victoryPointsMultiplier = victoryPointsMultiplier;
	}
	
	
	
}
