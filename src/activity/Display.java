package activity;

import testing.ActivityTest;

import javax.swing.JFrame;

public class Display {
    private static Object ActivityTest;

    public static void main(String[] args) {
        JFrame displayFrame = new JFrame();
        ActivityTest activityTesting = new ActivityTest();

        displayFrame.setSize(500, 500);
        displayFrame.setTitle("Test");
        displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayFrame.add(activityTesting);

        displayFrame.setVisible(true);
    }


}
