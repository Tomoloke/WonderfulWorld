package engine;

import java.awt.Canvas;
import java.awt.Graphics;

public abstract class AbstractGame {

	public abstract void update(GameContainer gc, float dt);
	public abstract void render(Graphics graphics, Canvas canvas);
	//public abstract void render(int width, int height, Graphics g);
	
}
