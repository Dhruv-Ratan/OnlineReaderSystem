import java.util.*;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println("Book ID: "+book.getBookId()+ ", Title: "+book.getTitle()+ ", Author: "+book.getAuthor());
        }
    }
}