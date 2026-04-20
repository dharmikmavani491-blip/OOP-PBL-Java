import java.util.Scanner;

public class College {

    // Outer class data member
    private String collegeName;

    // Constructor for College
    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Non-static inner class
    class Admission {
        private String studentName;
        private String course;

        // Method to accept student details
        public void acceptData() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name: ");
            studentName = sc.nextLine();

            System.out.print("Enter course: ");
            course = sc.nextLine();
        }

        // Method to display details
        public void displayData() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); // accessing outer class member
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create outer class object
        College college = new College("SSASIT College");

        // Create inner class object
        College.Admission admission = college.new Admission();

        // Input and display
        admission.acceptData();
        admission.displayData();
    }
}
