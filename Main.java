package LoginSystemOOP;

public class Main {
    public static void main(String []args){
        User user1 = new User("admin", "2233");

        user1.setPassword("newpass");
        if (user1.checkLogin("admin", "newpass")){
            user1.displayWelcome();
        } else {
            System.out.println("Login failed");
        }
    }
}
