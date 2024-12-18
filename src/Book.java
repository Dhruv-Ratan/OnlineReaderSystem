public class Book {
    private String title;
    private String author;
    private int bookId;
    private String content;
    private String category;
    private int totalPages;
    private int currentPage;
    private double ratings;

    public Book(int bookId,String title, String author, String category, int totalPages, double ratings) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.category = category;
        this.totalPages = totalPages;
        this.ratings = ratings;
        this.currentPage = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getCategory() {
        return category;
    }

    public double getRatings() {
        return ratings;
    }

    public void turnPageForward() {
        if(currentPage < totalPages) {
            currentPage++;
        }
    }

    public int getCurrentPage(){
        return currentPage;
    }
}