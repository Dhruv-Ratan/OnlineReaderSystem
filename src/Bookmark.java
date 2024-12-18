public class Bookmark {
    private int userId;
    private int bookId;
    private int pageNumber;
    private String note;

    public Bookmark(int userId, int bookId, int pageNumber, String note) {
        this.userId = userId;
        this.bookId = bookId;
        this.pageNumber = pageNumber;
        this.note = note;
    }

    public void displayBookmark() {
        System.out.println("User ID: " + userId + " Book: " + bookId + " Page: " + pageNumber + " Note: " + note);
    }
}