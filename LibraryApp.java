import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Add some books
        library.addBook(new Book("Effective Java", "Joshua Bloch", "9780134685991", 5));
        library.addBook(new Book("Clean Code", "Robert Martin", "9780132350884", 3));
        library.addBook(new Book("Head First Java", "Kathy Sierra", "9780596009205", 4));

        int choice;

        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. View All Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Search Book by Title");
            System.out.println("5. Sort Books by Title");
            System.out.println("6. Exit");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 3:
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.print("Enter the title of the book to search: ");
                    String searchTitle = scanner.nextLine();
                    Book book = library.searchByTitle(searchTitle);
                    if (book != null) {
                        System.out.println("Found: " + book.getTitle() + " by " + book.getAuthor());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 5:
                    library.sortByTitle();
                    System.out.println("Books sorted by title.");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
