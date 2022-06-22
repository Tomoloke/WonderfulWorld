
package engine;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class GameContainer implements Runnable {

	public Thread thread;
	//public Window window;
	public Display display;
	public Input input;
	public AbstractGame game;
	
	public boolean running = false;
	public final double UPDATE_CAP = 1.0/60.0;
	public int width, height;
	//public float scale = 1f;
	public String title = "GameEngine2D v1.0";
	long  nextStatTime;
	
	
	public GameContainer(AbstractGame game, int width, int height) {
		this.game = game;
		this.width = width;
		this.height = height;
	}
	
	public void start() {
		display = new Display(width, height);
		input = new Input();	
		display.addKeyListener(input);
		display.canvas.addMouseListener(input);
		display.canvas.addMouseMotionListener(input);
		display.canvas.addMouseWheelListener(input);
		thread = new Thread(this);
		thread.run();
	}
	
	public void stop() {
		
	}
	
	public void run() {
		running = true;
		
		boolean render = false;
		double firstTime = 0;
		double lastTime = System.nanoTime() / 1000000000.0;
		double passedTime = 0;
		double unprocessedTime = 0;
		
		running = true;
        double accumulator = 0;
        long currentTime, lastUpdate = System.currentTimeMillis();
        nextStatTime = System.currentTimeMillis() + 1000;

        while(running) {
render = false;
			
			firstTime = System.nanoTime() / 1000000000.0;
			passedTime = firstTime - lastTime;
			lastTime = firstTime;
			
			unprocessedTime += passedTime;
			
			while(unprocessedTime >= UPDATE_CAP) {
				unprocessedTime -= UPDATE_CAP;
				render = true;
				
				//TODO : Update game				
				game.update(this, (float)UPDATE_CAP);				
				input.update();
				
			}
			
			if(render) {
				display.renderGraphics(this);
			} else {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
		}
		
	}

	public void render(Graphics graphics, Canvas canvas) {
		game.render(graphics, canvas);
	}
}
