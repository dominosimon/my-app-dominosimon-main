package shapes;

import java.text.DecimalFormat;

public class Triangle extends Shape{

    /******************************************************
     * State: data fields
     *        initialize data fields 
     ******************************************************/
    public double a;
    public double b;
    public double c;

    /******************************************************
     * Constructor: Triangle
     *              data fields are initialized.
     * ****************************************************/
    public Triangle() {
        this(1, 1, 1);
    }

    /******************************************************
     * Constructor: Triangle(Triangle)
     *              data fields are initialized.
     * ****************************************************/
    public Triangle(Triangle other) {
        this(other.a, other.b, other.c);
    }

    /******************************************************
     * Constructor: Triangle(double, double, double)
     *              data fields are initialized.
     * ****************************************************/
    public Triangle(double a , double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /*******************************************************
     * method: area
     *         returns area of shape
     *******************************************************/
    public double area() {
        double s = (a + b + c) / 2;
        if( (s - a) == 0 || (s - b) == 0 || (s - c) == 0 ) {
            System.out.println("Cannot handle this operation");
            return -1;
        }else
            return Math.sqrt( (s- a) * (s-b) * (s-c) );
    }

    /******************************************************
     * method: perimeter
     *         returns perimeter of shape
     ******************************************************/
    public double perimeter() {
        return a + b + c;
    }

    /**********************************************************
     * method: thisShape
     * 		   displays which Shape
     **********************************************************/
    public String thisShape() {
        return "Triangle";
    }

    /******************************************************
     * method: toString
     * 		   displays parameters of Triangle
     ******************************************************/
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "[" + df.format(a) + ", " +  df.format(b) + ", " +  df.format(c)+ "]";
    }
}
