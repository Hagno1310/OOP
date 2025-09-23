package library;
import java.util.List;
import book.Book;

public class Library {
    private String name;
    private String address;
    private List<Book> books;

    public static int libraryCount = 0;

    public Library(String name, String address, List<Book> books) {
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
        libraryCount++;
    }

    public void removeBook(Book book) {
        books.remove(book);
        libraryCount--;
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getYear());
        }
    }

    public int getTotalBooks() {
        return libraryCount;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
