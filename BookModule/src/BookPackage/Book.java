package BookPackage;

public class Book {

    String title;
    String author;
    int BookId;

    public Book(String title, String author, int bookId) {
        this.title = title;
        this.author = author;
        this.BookId = bookId;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public int getBookId() {
        return BookId;
    }

}
