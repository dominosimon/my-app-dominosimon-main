package motion.circles;

import javax.swing.JFrame;

public class Viewer {

    //****************************************************
    //*	Creates and displays the display frame
    //****************************************************
    private static final int WIDTH  = 600;
    private static final int HEIGHT = 400;
    private static final int LEFT_X = 750;
    private static final int TOP_Y  = 100;

    public static void main(String[] args) {
        Controller panel = new Controller();
        JFrame frame  = new JFrame("Circle Display");
        frame.add(panel);

        frame.setSize(WIDTH, HEIGHT);
        frame.setLocation(LEFT_X, TOP_Y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
