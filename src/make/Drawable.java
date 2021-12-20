package make;

import java.awt.Color;
import java.awt.Graphics;
//I copied the starter code from the Design Doc on Canvas
//but for some reason it's giving me errors? What did I do wrong?
public interface Drawable{
    public void draw(Color AZUL){
        graphic.setColor(color);
        for (int i = 1; i < 11; i++){
            graphic.drawOval(x, y, 20 * i, 20 * i);
        }
    }

}

//package make;
//
//import make.Fillable;
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//
//public interface Drawable {
//    public void draw(Color AZUL){
//        Graphics g = new Graphics();
//        g.setColor(AZUL);
//        for (int i = 1; i < 11; i++){
//            g.drawOval(x, y, 20 * i, 20 * 1);
//        }
//    }
//}
