package testing;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;


public class ActivityTest extends JComponent {
    public void paintTest(Graphics g){
        Graphics2D graphics = (Graphics2D) g;

        Rectangle testRectangle = new Rectangle(100, 100, 200, 50);
        Color testColor = new Color(40, 0, 40);
        graphics.setColor(testColor);
        graphics.fill(testRectangle);
    }
}
//    public static void main(){
//        Graphics g = getGraphics();
//        Circles circleOne = new Circles(Graphics g, int x, int y);
//
//
//    }
//
//        public void draw(Graphics g){
//            g.drawOval(5, 10, 100, 100);
//    }
//


