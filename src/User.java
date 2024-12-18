import java.util.*;

public class User {
    private String name;
    private int userId;
    private String theme;
    private boolean isMembershipActive;
    private double ratings;
    private int fontSize;
    private Set<String> readingHistory;

    public User(int userId,String name, String theme) {
        this.userId = userId;
        this.name = name;
        this.theme = theme;
        this.isMembershipActive = true;
        this.fontSize = 12;
        this.readingHistory = new HashSet<>();
    }

    public String getName() { return name; }
    public int getUserId() { return userId; }
    public String getTheme() { return theme; }
    public void addReadingHistory(String category) {
        readingHistory.add(category);
    }

    public Set<String> getReadingHistory() { return readingHistory; }
}