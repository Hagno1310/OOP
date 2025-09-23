import library.Library;
import book.Book;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Library library = new Library("City Library", "123 Main St", new ArrayList<>());

        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Total books created: " + Book.getCount());

        System.out.println("Library Name: " + library.getName());
        System.out.println("Library Address: " + library.getAddress());
        System.out.println("Books in the Library:");
        library.showBooks();

        System.out.println("Total number of books in library: " + library.getTotalBooks());
    }
}


