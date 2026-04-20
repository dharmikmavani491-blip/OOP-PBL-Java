public class Point {

    // Data members
    private int x;
    private int y;

    // Default constructor (x = 5, y = 5)
    public Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Display method
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    // Main method to test
    public static void main(String[] args) {

        // Default constructor
        Point p1 = new Point();
        System.out.print("Default Constructor: ");
        p1.display();

        // Parameterized constructor
        Point p2 = new Point(10, 20);
        System.out.print("Parameterized Constructor: ");
        p2.display();

        // Copy constructor
        Point p3 = new Point(p2);
        System.out.print("Copy Constructor: ");
        p3.display();
    }
}
