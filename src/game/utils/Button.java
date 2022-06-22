package game.utils;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import engine.Input;

public class Button {
	
	public Point position;
    protected Size size;
    //protected Spacing margin;
    //protected Spacing padding;
    Color backgroundColor;
	
    protected boolean hasFocus;
    protected boolean isPressed;
    
    private UIText label;

    private ClickAction clickAction;
    
    public Button(String label, Point position, ClickAction clickAction) {
    	this.size = new Size(100, 50);
    	this.position = position;
        this.label = new UIText(label);
        this.label.update();
        this.clickAction = clickAction;
    }
    
    public void update(Input input) {
        Point mousePosition = new Point(input.getMouseX(), input.getMouseY());
        boolean previousFocus = hasFocus;

        hasFocus = getBounds().contains(mousePosition.x, mousePosition.y);
        isPressed = hasFocus && input.isButton(1);

        if(hasFocus && input.isButtonDown(1)) {
            onClick();
        }

        if(hasFocus && input.isButton(1)) {
            onDrag();
        }

        if(!previousFocus && hasFocus) {
            onFocus();
        }
        
        backgroundColor = Color.GRAY;

        if(hasFocus) {
        	backgroundColor = Color.LIGHT_GRAY;
        }

        if(isPressed) {
        	backgroundColor = Color.DARK_GRAY;
        }

    }

    protected void onFocus() {
        //state.getAudioPlayer().playSound("button.wav");
    }

    protected void onDrag() {

    }

    protected void onClick() {
        clickAction.execute();
    }

    
    public Image getSprite() {
    	BufferedImage image = (BufferedImage) ImageUtils.createCompatibleImage(size, ImageUtils.ALPHA_BIT_MASKED);
    	Graphics2D graphics = image.createGraphics();
    	graphics.setColor(backgroundColor);
    	graphics.fillRect(0, 0, size.getWidth(), size.getHeight());
    	Image labelImage = label.getSprite();
    	graphics.drawImage(labelImage, (size.getWidth() - labelImage.getWidth(null))/2, (size.getHeight() - labelImage.getHeight(null))/2, null);
    	graphics.dispose();
    	return image;
    }


    private Rectangle getBounds() {
        return new Rectangle(
                position.x,
                position.y,
                size.getWidth(),
                size.getHeight()
        );
    }
	
	
}
