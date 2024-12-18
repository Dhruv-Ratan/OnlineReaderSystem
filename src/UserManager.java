import java.util.*;

public class UserManager {
    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void listUsers() {
        for (User user : users) {
            System.out.println("User ID: "+user.getUserId()+",Name: "+user.getName()+",Theme: "+user.getTheme());
        }
    }
}