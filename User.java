package LoginSystemOOP;

public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
public boolean checkLogin(String inputUser, String inputPass){
        return username.equals(inputUser) && password.equals(inputPass);
}
    public void displayWelcome() {
        System.out.println("Welcome: " + username + "");
    }
}
