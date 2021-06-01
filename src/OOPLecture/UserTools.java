package OOPLecture;

import java.util.Scanner;

public class UserTools {
    public static Scanner scanner = new Scanner(System.in);

    public static void logIn(User u){
        System.out.println("Please enter your password: ");

        String userPassword = scanner.nextLine();

        if (userPassword.equals(u.getPassword())) {
            u.setLogedIn(true);
            System.out.println("You have successfully logged in!");
        }else {
            System.out.println("That password is incorrect.");
            logIn(u);
        }
    }

    public static void logout(User u){
        System.out.println("you sure you want to log out? (y/n) ");

        String userChoice = scanner.nextLine();

        if (userChoice.equalsIgnoreCase("y")) {
            System.out.println("You have successfully logged in!");
        }else {
            System.out.println("That password is incorrect.");
        }
    }

    public static void changePassword(User u) {
        if (!u.isLoggedIn()) {
            System.out.println("Sorry, you are logged out. please log in");
            logIn(u);
        }else {
            System.out.println("Please enter your current password: ");
            String currentPassword = scanner.nextLine();
            if (u.getPassword().equals(currentPassword)){
                System.out.println("Please enter a new password: ");
                String newPassword = scanner.nextLine();
                u.setPassword(newPassword);
                System.out.println(newPassword);

                u.setPassword(newPassword);
            }else {
                System.out.println("Sorry that password is incorrect");
            }
        }
    }

    public static void changeUsername(User u) {
        if (!u.isLoggedIn()){
            System.out.println("Sorry, you are logged out. please log in");
            logIn(u);
        }else {
            System.out.println("Please enter a new username");
            String newUsername = scanner.nextLine();


        }
    }

    public static void main(String[] args) {
        User testUser = new User();
        testUser.id = 1;
        testUser.username = "jayman";
//        if password is public
//        testUser.password = "password;
//        if password is private
        testUser.setPassword("password");
        testUser.email = "jayman@email.com";

        System.out.println("username: " + testUser.username);
        System.out.println("password: " + testUser.getPassword());
        System.out.println("email: " + testUser.email);

        UserTools.logIn(testUser);

        User user2 = new User("codeup-dude", "gocodeup", "codeup@email.com");

        System.out.println(user2.username);
        System.out.println(user2.getPassword());
        System.out.println(user2.email);

//        user2.setPassword("testPassword");
        System.out.println(user2.getPassword());

        changePassword(testUser);
    }

}
