import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        UserManager userManager = new UserManager();
        RecommendationSystem recommender = new RecommendationSystem();
        ReviewManager reviewManager = new ReviewManager();
        Display display = new Display("Light", 12);


        List<Bookmark> bookmarks = new ArrayList<>();


        library.addBook(new Book(1, "Introduction to Algorithms", "Thomas H. Cormen", "Computer Science", 1200, 4.8));
        library.addBook(new Book(2, "Clean Code", "Robert C. Martin", "Programming", 450, 4.7));
        library.addBook(new Book(3, "Design Patterns", "Erich Gamma", "Software Engineering", 395, 4.5));


        userManager.addUser(new User(101, "Arjun", "Light"));
        userManager.addUser(new User(102, "Ramesh", "Dark"));

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. List Users");
            System.out.println("2. List Books");
            System.out.println("3. Recommend Top Rated Books");
            System.out.println("4. Add a Book Review");
            System.out.println("5. Display All Reviews");
            System.out.println("6. Adjust Display Settings");
            System.out.println("7. Add a Bookmark");
            System.out.println("8. Display All Bookmarks");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    userManager.listUsers();
                    break;

                case 2:
                    library.listBooks();
                    break;

                case 3:
                    recommender.recommendTopRatedBooks(library);
                    break;

                case 4:
                    System.out.print("Enter your name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter your review: ");
                    String reviewText = scanner.nextLine();
                    System.out.print("Enter your rating (0-5): ");
                    try {
                        double rating = scanner.nextDouble();
                        reviewManager.addReview(userName, bookTitle, reviewText, rating);
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a numeric rating between 0 and 5.");
                        scanner.nextLine();
                    }
                    break;

                case 5:
                    reviewManager.displayReviews();
                    break;

                case 6:
                    System.out.println("1. Change Theme");
                    System.out.println("2. Change Font Size");
                    System.out.print("Enter your choice: ");
                    int displayChoice = scanner.nextInt();
                    if (displayChoice == 1) {
                        System.out.print("Enter theme (Light/Dark): ");
                        String theme = scanner.next();
                        display.setTheme(theme);
                    } else if (displayChoice == 2) {
                        System.out.print("Enter font size: ");
                        int fontSize = scanner.nextInt();
                        display.setFontSize(fontSize);
                    }
                    display.displayCurrentSettings();
                    break;

                case 7:
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Page Number: ");
                    int pageNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter a Note: ");
                    String note = scanner.nextLine();
                    bookmarks.add(new Bookmark(userId, bookId, pageNumber, note));
                    System.out.println("Bookmark added successfully!");
                    break;

                case 8:
                    if (bookmarks.isEmpty()) {
                        System.out.println("No bookmarks found.");
                    } else {
                        System.out.println("Bookmarks:");
                        for (Bookmark bookmark : bookmarks) {
                            bookmark.displayBookmark();
                            System.out.println();
                        }
                    }
                    break;

                case 9:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);
        scanner.close();
    }
}
