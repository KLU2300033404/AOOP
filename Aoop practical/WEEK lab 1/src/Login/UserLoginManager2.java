package Login;
public class UserLoginManager2 {
private static UserLoginManager2 instance;
private boolean loggedIn = false;
private UserLoginManager2() {
}
public static UserLoginManager2 getInstance() {
    if (instance == null) {
        instance = new UserLoginManager2();
    }
    return instance;
}
public void login(String username, String password) {
    if (!loggedIn) {
        loggedIn = true;
        System.out.println(username + " logged in successfully");
    } else {
        System.out.println("User is already logged in");
    }
}
public void logout() {
    if (loggedIn) {
        loggedIn = false;
        System.out.println("User logged out successfully");
    } else {
        System.out.println("No user is currently logged in");
    }
}

public boolean isLoggedIn() {
    return loggedIn;
}
}