public class DivisionExample {
    public static void main(String[] args) {

        try {
            // Check if arguments are provided
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide numerator and denominator.");
            }

            // Convert arguments to integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            // Perform division
            int result = numerator / denominator;

            // Display result
            System.out.println("Result: " + result);

        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer values.");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e);
        } 
        finally {
            System.out.println("Program execution completed.");
        }
    }
}
