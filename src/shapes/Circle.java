package shapes;

import java.text.DecimalFormat;

public class Circle extends Shape {

    /**********************************************************
     * State: data fields
     *        initialize data fields
     **********************************************************/
    public double radius;

    /**********************************************************
     * Constructor: Circle
     *              data fields are initialized.
     * ********************************************************/
    public Circle() {
        this(1.0);
    }

    /**********************************************************
     * Constructor: Circle(Circle)
     *              data fields are initialized.
     * ********************************************************/
    public Circle(Circle other) {
        this(other.radius);
    }

    /**********************************************************
     * Constructor: Circle(double)
     *              data fields are initialized.
     * ********************************************************/
    public Circle(double radius) {
        this.radius = radius;
    }

    /**********************************************************
     * accessor: getRadius
     *           accesses radius field
     **********************************************************/
    public double getRadius() {
        return radius;
    }

    /**********************************************************
     * mutator: setRadius
     *          modifies radius data field
     **********************************************************/
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**********************************************************
     * method: area
     *         returns area of shape
     **********************************************************/
    public double area() {
        return Math.PI * radius * radius;
    }

    /**********************************************************
     * method: perimeter
     *         returns perimeter of shape
     **********************************************************/
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /**********************************************************
     * method: thisShape
     * 		   displays which Shape
     **********************************************************/
    public String thisShape() {
        return "Circle";
    }

    /******************************************************
     * method: toString
     * 		   displays parameters of Circle
     ******************************************************/
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "[ " + df.format(radius) + " ]";
    }

}
