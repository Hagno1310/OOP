package book;

public class Book {
    private String title;
    private String author;
    private int year;

    public static int countBooks = 0;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        countBooks++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public static int getCount() {
        return countBooks;
    }
    
}