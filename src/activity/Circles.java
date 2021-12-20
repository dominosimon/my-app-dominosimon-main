package activity;

import make.Drawable;
import make.Fillable;
import java.awt.Color;
import java.awt.Graphics;

public class Circles extends Shapes implements Drawable, Fillable{
    public Circles(Graphics g1){
    }
    public Circles(Graphics g2, int x, int y){
        Color c = new Color(0, 100, 255);
        g2.drawOval(x, y, x, y);
        g2.fillOval(x, y, x, y);
        g2.setColor(c);
    }
}
//
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
////import make.Drawable;
////import make.Fillable;
//import make.Moveable;
//
////public class Circles extends Shapes implements Drawable, Fillable, Moveable {
//    public Circles(Graphics graphic){
//
//    }
//    public Circles(Graphics g, int x, int y){
////        g.drawOval(5, 10, 100, 100);
//
//    }
//    public void draw(Color color){
//
//    }
//    public void fill(Color color){
//
//    }
//}
