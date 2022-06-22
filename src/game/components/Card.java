package game.components;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class Card {
	
	public BufferedImage image;

	public String cost;
	public char trash;
	public char simbol;
	public String instaGain;
	public String production;
	public char productionMultiplier;
	public int victoryPoints;
	public char victoryPointsMultiplier;

	public Card(String imagePath, String cost, char trash, char simbol, String instaGain, String production,
			char productionMultiplier, int victoryPoints, char victoryPointsMultiplier) {
		File file = new File("res/" + imagePath);
		try {
			image = ImageIO.read(file);
			//image = ImageIO.read(Image.class.getResourceAsStream(imagePath));
		} catch (IOException e) {
			System.out.println("Not found: " + imagePath);
		}
		
		this.cost = cost;
		this.trash = trash;
		this.simbol = simbol;
		this.instaGain = instaGain;
		this.production = production;
		this.productionMultiplier = productionMultiplier;
		this.victoryPoints = victoryPoints;
		this.victoryPointsMultiplier = victoryPointsMultiplier;
		

			

	}
	
	
	
}
