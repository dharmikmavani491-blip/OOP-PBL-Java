// Interface Exam
interface Exam {
    boolean isPassed(int mark);
}

// Interface Classify
interface Classify {
    String getDivision(double average);
}

// Class implementing both interfaces
class Result implements Exam, Classify {

    // Implementation of Exam interface
    @Override
    public boolean isPassed(int mark) {
        return mark >= 40; // passing criteria
    }

    // Implementation of Classify interface
    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Below First Division";
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Result r = new Result();

        int mark = 55;
        double average = 65.5;

        // Using Exam interface method
        System.out.println("Marks: " + mark);
        if (r.isPassed(mark)) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

        // Using Classify interface method
        System.out.println("Average: " + average);
        System.out.println("Division: " + r.getDivision(average));
    }
}
