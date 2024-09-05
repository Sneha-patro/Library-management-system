import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Search for a book by title using linear search
    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Borrow a book by title
    public void borrowBook(String title) {
        Book book = searchByTitle(title);
        if (book != null && book.getAvailableCopies() > 0) {
            book.borrowBook();
            System.out.println("You borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Book not available for borrowing.");
        }
    }

    // Return a book by title
    public void returnBook(String title) {
        Book book = searchByTitle(title);
        if (book != null) {
            book.returnBook();
            System.out.println("You returned the book: " + book.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }

    // Sort books by title using a basic bubble sort
    public void sortByTitle() {
        int n = books.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (books.get(j).getTitle().compareTo(books.get(j + 1).getTitle()) > 0) {
                    // Swap books
                    Book temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
    }

    // Display all books
    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() +
                               ", ISBN: " + book.getIsbn() + ", Available Copies: " + book.getAvailableCopies());
        }
    }
}

