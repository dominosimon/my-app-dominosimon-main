package testing;
//Struggling with Lab 4 :(
import activity.Circles;
import activity.Display;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class ActivityTest extends JComponent {
    public void paintTest(){
        Graphics g = new Graphics();
        Circles circleOne = new Circles(g, 20, 20);
        Color colorOne = new Color(0, 150, 255);
        g.setColor(colorOne);
        new Display(g, circleOne, colorOne);
    }
}

