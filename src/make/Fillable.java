package make;

import java.awt.*;

public interface Fillable {
    public static final Color AZUL = new Color(0, 100, 250);
    public default void fill(Color color) {
        Graphics graphic = null;
        graphic.setColor(color);
        int x = 0;
        int y = 0;
        for (int i = 1; i < 7; i++)
            graphic.fillOval(x * i, y * i, 1 * 0 * i, 10 * i);
    }
}
