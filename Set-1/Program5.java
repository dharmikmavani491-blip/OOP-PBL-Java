import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sides
        System.out.print("Enter three sides of the triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Validate triangle
        if (a + b > c && a + c > b && b + c > a) {
            
            // Calculate semi-perimeter
            double s = (a + b + c) / 2;

            // Calculate area using Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            // Output result
            System.out.printf("Area of the triangle: %.2f\n", area);
        } else {
            System.out.println("Invalid triangle! The given sides do not form a triangle.");
        }

        sc.close();
    }
}
