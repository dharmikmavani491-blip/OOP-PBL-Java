import java.io.*;

public class StudentFileDemo {
    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedReader br = null;

        try {
            // Step 1: Create and write to file
            fw = new FileWriter("students.txt");

            fw.write("101 Dharmik 85\n");
            fw.write("102 Rahul 78\n");
            fw.write("103 Priya 92\n");

            System.out.println("Student records written to file.\n");

            fw.close(); // close after writing

            // Step 2: Read from file
            br = new BufferedReader(new FileReader("students.txt"));

            String line;
            System.out.println("Reading student records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Ensure resources are closed
            try {
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }

            System.out.println("\nFile operation completed.");
        }
    }
}
