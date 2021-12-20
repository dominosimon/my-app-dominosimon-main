package activity;
import testing.ActivityTest;
import activity.Circles;
import javax.swing.JFrame;
import java.awt.*;

public class Display {

    //Display takes a graphic object
    public static void main(String[] args) {
        JFrame displayFrame = new JFrame();
        ActivityTest activityTest = new ActivityTest();

        displayFrame.setSize(500, 500);
        displayFrame.setTitle("Display Window");
        displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayFrame.add(activityTest);

        displayFrame.setVisible(true);
    }
}
   //public static void display(Graphics g, Circles c, Color b) {