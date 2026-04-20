import java.io.*;

public class DataFileAnalysis {
    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("data.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Count characters (excluding spaces)
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        charCount++;
                    }
                }
            }

            // Display results
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces & newlines): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File 'data.txt' not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
        }
    }
}
