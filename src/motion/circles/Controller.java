package motion.circles;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serial;

public class Controller extends JPanel implements MouseListener, MouseMotionListener{

    @Serial
    private static final long serialVersionUID = 1L;
    private Circle circle;
    Point point;

    //****************************************************
    //*	Sets up this Panel and Listener for mouse events.
    //* Panel listens for mouse events
    //****************************************************
    public Controller() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    //****************************************************
    //*	Draws the current circle, if any
    //****************************************************
    public void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        if(circle != null) {
            circle.draw(pen);
        }
    }

    //****************************************************
    //*	Create new circle at the location, whenever the
    //* mouse button is pressed and repaints.
    //****************************************************
    public void mousePressed(MouseEvent event) {
        point = event.getPoint();
        circle = new Circle(point);
        repaint();
    }

    public void mouseDragged(MouseEvent event) {
        point = event.getPoint();
        circle.move(point);
        repaint();
    }

    //****************************************************
    //*	Provides empty definitions for the unused
    //* mouse methods of the Listener interface.
    //****************************************************
    public void mouseMoved(MouseEvent event) {}
    public void mouseEntered(MouseEvent event) {	}
    public void mouseExited(MouseEvent event) {}
    public void mouseClicked(MouseEvent event) {	}
    public void mouseReleased(MouseEvent event) {}

}
