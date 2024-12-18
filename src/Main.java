import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        UserManager userManager = new UserManager();
        RecommendationSystem recommender = new RecommendationSystem();
        ReviewManager reviewManager = new ReviewManager();
        Display display = new Display("Light", 12);

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
            System.out.println("7. Exit");
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
                    double rating = scanner.nextDouble();
                    reviewManager.addReview(userName, bookTitle, reviewText, rating);
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
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        scanner.close();
    }
}
