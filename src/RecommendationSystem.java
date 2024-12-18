import java.util.*;

public class RecommendationSystem {
    public void recommendTopRatedBooks(Library library){
        System.out.println("Top Rated Books: ");
        List<Book> books = library.getBooks();
        books.sort((b1,b2) -> Double.compare(b2.getRatings(),b1.getRatings()));
        for(Book book : books){
            System.out.println("Title: "+book.getTitle());
        }
    }

    public void recommendBooksBasedOnUserHistory(Library library, User user){
        System.out.println("Recommendations: "+user.getName());

        Set<String> history = user.getReadingHistory();
        for (Book book : library.getBooks()) {
            if(history.contains(book.getCategory())){
                System.out.println("Title: "+book.getTitle()+",Category: "+book.getCategory());
            }
        }
    }
}