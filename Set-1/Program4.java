import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();

        // Convert to metric units
        double weightKg = pounds * 0.45359237;
        double heightM = inches * 0.0254;

        // Calculate BMI
        double bmi = weightKg / (heightM * heightM);

        // Display result
        System.out.printf("Your BMI is: %.2f\n", bmi);

        sc.close();
    }
}
