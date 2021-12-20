package make;

import java.awt.Color;
//So I guess the problem has to do with the graphics object
//Do I use the same graphics object that I created for ActivityTest or create a new one?
//Or am I just overthinking things?
public interface Fillable{
    Color AZUL = new Color(0, 100, 250);
    static void fill(Color color){
        graphic.setColor(color);
        for (int i = 1; i < 7; i++)
            graphic.fillOval(x * i, y * i, 10 * i, 10 * i);
    }
}

//
//import make.Drawable;
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//
//public interface Fillable {
//    public void fill(Graphics g);
//    Color AZUL = new Color(0, 100, 250);
//    void fill(Color color) {
//        g.setColor(color);
//    }
//    }
//    for(int i = 1; i < 7; i++)
//        graphic.fillOval(x * i, y * 1, 10 * i, 10 * i);
//}
