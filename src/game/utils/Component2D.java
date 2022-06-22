package game.utils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Component2D {

	private ArrayList<Point> vertices;
	private String name;
	private BufferedImage image;
	private Point posCenter;
	private double rotation;
	private double scale;
	private boolean outlineVisible;
	
	Component2D(String name){
		this.name = name;
		try {
			image = ImageIO.read(new File(name));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			image = null;
		}
		posCenter = new Point(0,0);
		rotation = 0.0;
		scale = 1.0;
		vertices = new ArrayList<>();
		vertices.add(new Point(-image.getWidth()/2, -image.getHeight()/2));
		vertices.add(new Point(image.getWidth()/2, -image.getHeight()/2));
		vertices.add(new Point(image.getWidth()/2, image.getHeight()/2));
		vertices.add(new Point(-image.getWidth()/2, image.getHeight()/2));
		outlineVisible = true;
	}
	
	public void setScale(double s) {
		scale = s;
	}
	
	
	public void setCenter(int x, int y) {
		posCenter.setLocation(x, y);
	}
	
	public void translate(int dx, int dy) {
		posCenter.translate(dx, dy);
	}
	
	public void setRotation(Double angle) {			
		rotation = angle;
	}
		
	public void rotate(Double da) {
		rotation = rotation + da;
	}
	
	public Polygon getOutline() {
		int [] xpoints = new int[vertices.size()];
		int [] ypoints = new int[vertices.size()];
		for(int i = 0; i < vertices.size(); i++) {
			Point point = new Point(vertices.get(i).x, vertices.get(i).y);
			double rotatedX = Math.cos(Math.toRadians(rotation)) * (point.x) - Math.sin(Math.toRadians(rotation)) * (point.y);
			double rotatedY = Math.sin(Math.toRadians(rotation)) * (point.x) + Math.cos(Math.toRadians(rotation)) * (point.y);
			xpoints[i] = (int) (rotatedX * scale + posCenter.x);
			ypoints[i] = (int) (rotatedY * scale + posCenter.y);
		}
		return new Polygon(xpoints, ypoints, vertices.size());
	}
	
	public void drawComponent(Graphics g) {
		 
		AffineTransform at = AffineTransform.getTranslateInstance(posCenter.getX()-image.getWidth()/2*scale, posCenter.getY()-image.getHeight()/2*scale);
		at.rotate(Math.toRadians(rotation), image.getWidth()/2*scale, image.getHeight()/2*scale);
		at.scale(scale, scale);
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(image, at, null);
		
		if(outlineVisible) {	
			g2d.setColor(Color.RED);
			g2d.draw(getOutline());
			g2d.setColor(null);
		}
	}
	
	public Point getCenter() {
		return posCenter;
	}
	
	public Double getRotation() {
		return rotation;
	}
	
	public void setOuline(boolean v) {
		outlineVisible = v;
	}
}
