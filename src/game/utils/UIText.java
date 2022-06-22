package game.utils;


import java.awt.*;
import java.awt.image.BufferedImage;

public class UIText {

    private String text;
    private int fontSize;
    private int fontStyle;
    private String fontFamily;
    private Color color;

    private boolean dropShadow;
    private int dropShadowOffset;
    private int padding;
    private Color shadowColor;

    private Font font;
    private Size size;

    public UIText(String text) {
    	this.size = new Size(1, 1);
    	
        this.text = text;
        this.fontSize = 16;
        this.fontStyle = Font.BOLD;
        this.fontFamily = "Joystix Monospace";
        this.color = Color.WHITE;

        this.dropShadow = true;
        this.dropShadowOffset = 2;
        this.padding = 0;
        this.shadowColor = new Color(140,140, 140);
    }

    
    public Image getSprite() {
        BufferedImage image = (BufferedImage) ImageUtils.createCompatibleImage(size, ImageUtils.ALPHA_BIT_MASKED);
        Graphics2D graphics = image.createGraphics();
        graphics.setFont(font);

        if(dropShadow) {
            graphics.setColor(shadowColor);
            graphics.drawString(text, padding + dropShadowOffset, fontSize + padding + dropShadowOffset);
        }

        graphics.setColor(color);
        graphics.drawString(text, padding, fontSize + padding);

        graphics.dispose();
        return image;
    }

    public void update(/*State state*/) {
        createFont();
        calculateSize();
    }

    private void calculateSize() {
        FontMetrics fontMetrics = new Canvas().getFontMetrics(font);
        int width = fontMetrics.stringWidth(text) + padding;
        int height = fontMetrics.getHeight() + padding;

        if(dropShadow) {
            width += dropShadowOffset;
        }

        size = new Size(width, height);
    }

    private void createFont() {
        font = new Font(fontFamily, fontStyle, fontSize);
    }

    public void setText(String text) {
        this.text = text;
    }
}
