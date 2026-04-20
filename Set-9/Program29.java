import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> marks = new ArrayList<>();

        // Add at least 5 marks
        marks.add(85);
        marks.add(72);
        marks.add(90);
        marks.add(66);
        marks.add(78);

        // Display all marks
        System.out.println("Student Marks:");
        for (int m : marks) {
            System.out.println(m);
        }

        // Find highest and lowest marks
        int max = Collections.max(marks);
        int min = Collections.min(marks);

        // Display results
        System.out.println("\nHighest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}
