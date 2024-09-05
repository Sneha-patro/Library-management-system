public class Book {
    private String title;
    private String author;
    private String isbn;
    private int totalCopies;
    private int availableCopies;

    // Constructor
    public Book(String title, String author, String isbn, int totalCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
        } else {
            System.out.println("No copies available to borrow.");
        }
    }

    public void returnBook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
        }
    }
}
