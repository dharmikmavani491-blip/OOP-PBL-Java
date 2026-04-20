import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Convert to lowercase (optional for uniform counting)
        input = input.toLowerCase();

        // Split sentence into words
        String[] words = input.split("\\s+");

        // Create HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Display results
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}
