package make;

public interface Moveable {
    public default void move(int dx, int dy) {
        int x = 10;
        int y = 20;
    }
}
