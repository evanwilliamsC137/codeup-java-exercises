package OOPLecture;

import java.util.Scanner;

public class UserManager {
    public static Scanner scanner = new Scanner(System.in);

    public static void startMenu(User u) {
        System.out.println("Welcome, what would you like to do?");
        System.out.println("1. Log in\n2.Exit program.");

        int userChoice = scanner.nextInt();
        scanner.next();
        if (userChoice == 1){
            UserTools.logIn(u);
        }else {
            System.out.println("Thanks for your time");
        }
    }

    public static void editPreferences(User u) {
        if (!u.isLoggedIn()) {
            System.out.println("Sorry, you are logged out. please log in");
            UserTools.logIn(u);
        }else {
            System.out.println("Welcome to your preferences, Would you like to:\n1.Change your password.\n2. view credentials\n3.Log out");
            int userChoice = scanner.nextInt();
            System.out.println("you chose choice " + userChoice);
            switch (userChoice) {
                case 1:
                    UserTools.changePassword(u);
                    editPreferences(u);
                    break;
                case 2:
                    u.describeUser();
                    editPreferences(u);
                    break;
                case 3:
                    u.describeUser();
                    editPreferences(u);
                    break;
                default:
                    UserTools.logout(u);
                    startMenu(u);
            }
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
        System.out.println(testUser.getPassword());


        UserTools.logIn(testUser);
        User user2 = new User("codeup-dude", "gocodeup", "codeup@email.com");

        startMenu(user2);
    }
}
