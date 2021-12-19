package testing;
import java.util.Scanner; //testing if updating works with this

class MeasurementTest {

    public static double calcRectangleArea(Scanner scnr) {


        System.out.println("Enter the length: ");
        double length = scnr.nextDouble();
        System.out.println("Enter the width: ");
        double width = scnr.nextDouble();

        return length * width;
    }

    public static double calcCircleArea(Scanner scnr) {
        double circleRadius;
        double circleArea;
        double piVal = 3.14159265;

        System.out.println("Enter the radius of your circle: ");
        circleRadius = scnr.nextDouble();
        circleArea = piVal * circleRadius * circleRadius;

        return circleArea;
    }

    public static double calcSphericalVolume(Scanner scnr) {
        double sphereRadius;
        double sphericalVolume;
        double piVal = 3.14159265;

        System.out.println("Enter the radius of your sphere: ");
        sphereRadius = scnr.nextDouble();
        sphericalVolume = 4.0 / 3.0 * piVal * (sphereRadius * sphereRadius * sphereRadius);

        return sphericalVolume;
    }

    public static double toCelcius(Scanner scnr) {
        double fahrenheit;
        double celcius;

        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = scnr.nextDouble();
        celcius = (fahrenheit - 32) * 5 / 9;

        return celcius;
    }

    public static double toFahrenheit(Scanner scnr) {
        double celcius;
        double fahrenheit;

        System.out.println("Enter the temperature in Celcius: ");
        celcius = scnr.nextDouble();
        fahrenheit = (celcius * 9 / 5) + 32;

        return fahrenheit;
    }

    public static double quadratic(Scanner scnr) {
        int a;
        int b;
        int c;
        double x;

        System.out.println("Enter the values for a, b, and c: ");
        a = scnr.nextInt();
        b = scnr.nextInt();
        c = scnr.nextInt();
        x = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
        return x;

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Your rectangle has an area of " + calcRectangleArea(scnr) + " units.");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Your circle has an area of " + calcCircleArea(scnr) + " units.");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Your sphere has a volume of " + calcSphericalVolume(scnr) + " units.");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Your temperature is " + toCelcius(scnr) + " degrees Celcius.");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Your temperature is " + toCelcius(scnr) + " degrees Celcius.");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Your temperature is " + toFahrenheit(scnr) + " degrees Fahrenheit.");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Your temperature is " + toFahrenheit(scnr) + " degrees Fahrenheit.");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("The value of x in your equation is " + quadratic(scnr) + ".");
        System.out.println("--------------------------------------------------------------------");
    }
}

