package LibraryPackage;

import BookPackage.Book;
import VisitorPackage.Visitor;
import ApprovalPackage.Approval;
import BorrowPackage.Borrowing;
import static ApprovalPackage.Approval.BookIdValid;

public class Library {
    public static void main(String[] args) {
   Book book= new Book("True Love","Mick", 10);

   Visitor visitor = new Visitor("Lam","LamX@gamil.com");
        Borrowing borrowing = new Borrowing("Love and Thunder","Lam","2023_12_13");

        System.out.println("Book Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Book ID: " + book.getBookId());

        System.out.println("Visitor Details");
        System.out.println("Visitor Name: " + visitor.getName());
        System.out.println("Visitor Email: " + visitor.getEmail());
        System.out.println("Borrow Date: " + borrowing.getBorrowDate());

        System.out.println("Borrowing Details");
        System.out.println("Book Title: " + borrowing.getBook());
        System.out.println("Borrower Name: " + borrowing.getVisitor());
        System.out.println("Borrow Date: " + borrowing.getBorrowDate());



        if (BookIdValid(book.getBookId()) && Approval.VisitorNameValid(visitor.getName())) {
            System.out.println("\nApproval: The book can be borrowed.");
        } else {
            System.out.println("\nApproval: The book cannot be borrowed.");
        }

    }
}
