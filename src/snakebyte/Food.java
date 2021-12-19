package snakebyte;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Food {

    private double  n;
    private double  x;
    private double  y;
    private int    	score;
    private Snake  	snake;

    private Color foodColor;
    public static final int SIZE  = 10;

    public Food(Snake _snake) {
        foodColor = Color.GREEN;
        n         = 1.5;
        score 	  = 0;
    }

    public void draw(Graphics _graphics) {
        Graphics2D 	pen 	= (Graphics2D) _graphics;
        Rectangle2D food 	= new Rectangle2D.Double(x, y, SIZE, SIZE);
    }

    public int getScore() {
        return 0;
    }


}
