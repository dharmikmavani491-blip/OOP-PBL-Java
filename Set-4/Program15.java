class Employee {
    protected String name;
    protected String department;

    // Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Subclass Manager
class Manager extends Employee {
    private int teamSize;
    private String projectName;

    // Constructor
    public Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    // Overriding method
    @Override
    public void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Employee object
        Employee emp = new Employee("Dharmik", "IT");

        // Manager object
        Employee mgr = new Manager("Rahul", "HR", 10, "Recruitment System");

        // Method calls
        System.out.println("Employee Details:");
        emp.displayDetails();

        System.out.println("\nManager Details:");
        mgr.displayDetails();  // Runtime polymorphism
    }
}
