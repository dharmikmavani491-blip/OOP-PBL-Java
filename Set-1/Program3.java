import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter a single letter: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase for case-insensitive check
        ch = Character.toLowerCase(ch);

        // Check if alphabet
        if (ch >= 'a' && ch <= 'z') {
            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It is a Vowel.");
            } else {
                System.out.println("It is a Consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }

        sc.close();
    }
}
