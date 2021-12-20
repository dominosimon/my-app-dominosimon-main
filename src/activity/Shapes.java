package activity;

import make.Moveable;

public class Shapes implements Moveable {
    int x = 0;
    int y = 0;
    public void Shape(){
    }
    public void Shape(int x, int y){
        x = 10;
        y = 5;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void move(int dx, int dy){
    }
    public void setLocation(int x, int y){
    }
}
