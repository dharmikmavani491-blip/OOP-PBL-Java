// Custom Exception
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Library class
class Library {
    private int availableBooks;

    // Constructor
    public Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    // Method to issue books
    public void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Books remaining: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Initialize library with 3 books
        Library lib = new Library(3);

        try {
            // Valid case
            lib.issueBook(2);

            // Invalid case (should throw exception)
            lib.issueBook(2);

        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program ended.");
    }
}
