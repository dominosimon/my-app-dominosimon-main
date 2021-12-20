package homeworkTesting;
import javax.swing.JFrame;

public class testClass {
    public static void main(String[] args) {
        JFrame appFrame = new JFrame();
        testWork histogramComponent = new testWork();

        appFrame.setSize(500, 500);
        appFrame.setTitle("Histogram Viewer");
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        appFrame.add(histogramComponent);

        appFrame.setVisible(true);
    }
}
