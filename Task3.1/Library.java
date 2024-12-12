

class Library {
    private Book[] books;
    private int count; // Keeps track of the number of books added

    public Library() {
        this.books = new Book[5]; // Maximum of 5 books
        this.count = 0;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to replace a book in the library
    public void replaceBook(int bookID, String newTitle, String newAuthor) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                books[i].setTitle(newTitle);
                books[i].setAuthor(newAuthor);
                System.out.println("Book updated successfully!");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Method to search for a book by ID
    public Book searchBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                return books[i];
            }
        }
        return null;
    }

    // Method to display all books in the library
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
