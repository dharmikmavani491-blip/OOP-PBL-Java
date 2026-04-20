public class Rectangle {

    // Data fields
    double width;
    double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Method to display details
    public void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    // Main method
    public static void main(String[] args) {

        // Create two Rectangle objects
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        // Display details
        System.out.println("Rectangle 1:");
        r1.display();

        System.out.println("\nRectangle 2:");
        r2.display();

        // Compare areas
        if (r1.getArea() > r2.getArea()) {
            System.out.println("\nRectangle 1 has a larger area.");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("\nRectangle 2 has a larger area.");
        } else {
            System.out.println("\nBoth rectangles have equal area.");
        }
    }
}
