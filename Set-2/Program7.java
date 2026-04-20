import java.util.Scanner;

public class Employee {

    // Private instance variables
    private String employeeName;
    private double employeeSalary;

    // Method to read employee data
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    // Method to display employee data
    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }

    // Main method
    public static void main(String[] args) {
        // Object creation
        Employee emp = new Employee();

        // Method calls
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}
