import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        // Create an instance of Library to manage books
        Library library = new Library();
        
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Menu-driven loop for user interaction
        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Replace Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Process user choice
            switch (choice) {
                case 1:
                    // Add a new book to the library
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();

                    // Create a new Book object and add it to the library
                    Book book = new Book(bookID, title, author);
                    library.addBook(book);
                    break;

                case 2:
                    // Replace an existing book in the library
                    System.out.print("Enter Book ID to Replace: ");
                    int replaceID = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter New Author: ");
                    String newAuthor = scanner.nextLine();

                    // Update the book details in the library
                    library.replaceBook(replaceID, newTitle, newAuthor);
                    break;

                case 3:
                    // Search for a book by its ID
                    System.out.print("Enter Book ID to Search: ");
                    int searchID = scanner.nextInt();

                    // Search for the book in the library
                    Book foundBook = library.searchBook(searchID);
                    if (foundBook != null) {
                        System.out.println("Book Found: " + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    // Display all books in the library
                    System.out.println("Displaying All Books:");
                    library.displayBooks();
                    break;

                case 5:
                    // Exit the system
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close(); // Close the scanner to release resources
                    return;

                default:
                    // Handle invalid menu choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
