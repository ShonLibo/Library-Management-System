package BorrowPackage;

public class Borrowing {
    String book;
    String visitor;
     String borrowDate;

    public Borrowing(String book, String visitor, String borrowDate){
        this.book =book;
        this.visitor = visitor;
      this.borrowDate = borrowDate;
    }

    public String getBook() {
        return book;
    }

    public String getVisitor() {
        return visitor;
    }

    public String getBorrowDate() {
        return borrowDate;
    }
}
