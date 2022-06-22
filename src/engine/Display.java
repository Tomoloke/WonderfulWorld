package engine;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Display extends JFrame {

    public Canvas canvas;

    public Display(int width, int height) {
        setTitle("My Awesome 2D game.Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setFocusable(false);
        //canvas.addMouseListener(input);
        //canvas.addMouseMotionListener(input);
        add(canvas);
        //addKeyListener(input);
        pack();

        canvas.createBufferStrategy(2);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void renderGraphics(GameContainer gc){
    	 BufferStrategy bufferStrategy = canvas.getBufferStrategy();
         Graphics graphics = bufferStrategy.getDrawGraphics();

         graphics.setColor(Color.BLACK);
         graphics.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

          gc.render(graphics, canvas);

         graphics.dispose();
         bufferStrategy.show();
    }
}
