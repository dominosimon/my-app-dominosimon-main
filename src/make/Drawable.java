package make;

import java.awt.*;

public interface Drawable {
    public default void draw(Color color) {
        Graphics graphic = null;
        graphic.setColor(color);
        for (int i = 1; i < 11; i++) {
            int x = 0;
            int y = 0;
            graphic.drawOval(x, y, 20 * i, 20 * i);
        }
    }
}
