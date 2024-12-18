import java.util.*;

public class ReviewManager {
    public static class Review {
        private String userName;
        private String bookTitle;
        private String reviewText;
        private double rating;

        public Review(String userName, String bookTitle, String reviewText, double rating) {
            this.userName = userName;
            this.bookTitle = bookTitle;
            this.reviewText = reviewText;
            this.rating = rating;
        }
    }

    private List<Review> reviews;
    public ReviewManager() {
        reviews = new ArrayList<>();
    }

    public void addReview(String userName, String bookTitle, String reviewText, double rating) {
        if (rating<0 || rating>5){
            System.out.println("Rating must be between 0 and 5");
            return;
        }
        reviews.add(new Review(userName, bookTitle, reviewText, rating));
        System.out.println("Review added");
    }

    public void displayReviews() {
        if(reviews.isEmpty()){
            System.out.println("No reviews found");
            return;
        }
        System.out.println("Reviews:");
        for(Review r : reviews){
            System.out.println(r);
        }
    }
}