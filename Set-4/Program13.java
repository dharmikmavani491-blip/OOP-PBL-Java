class Shape {
    double d1, d2;

    // Method to initialize data
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

// Derived class: Triangle
class Triangle extends Shape {

    // Method to calculate area of triangle
    double calculateArea() {
        return 0.5 * d1 * d2;
    }
}

// Derived class: Rectangle
class Rectangle extends Shape {

    // Method to calculate area of rectangle
    double calculateArea() {
        return d1 * d2;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Triangle object
        Triangle t = new Triangle();
        t.getData(10, 5); // base and height
        System.out.println("Area of Triangle: " + t.calculateArea());

        // Rectangle object
        Rectangle r = new Rectangle();
        r.getData(4, 6); // length and width
        System.out.println("Area of Rectangle: " + r.calculateArea());
    }
}
