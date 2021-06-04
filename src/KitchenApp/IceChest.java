package KitchenApp;

import java.util.Scanner;

public class IceChest implements StoreFood {

    private boolean hasIce;

    public void keepFresh() {
//        If user wants to add to ice chest, does item need ice?
//        if needs ice we can set hasIce = true, then add more
//        if not we can set hasIce to false, and continue add items


        Scanner sc = new Scanner(System.in);
        System.out.println("Does the item you want to keep in the ice chest need to be kept cold? (Y/N)");
        String userChoice = sc.nextLine();
        if (userChoice.equalsIgnoreCase("yes") || userChoice.equalsIgnoreCase("y")) {
            this.hasIce = true;
            System.out.println("Ice has been added.");
            do {
                System.out.println("What would you like to keep cool?");
                String item = sc.nextLine();
                System.out.printf("%s has been added to the ice chest.\n", item);
                System.out.println("Would you like to add another item?");
                userChoice = sc.nextLine();
            } while(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));
            // Exiting the program.
            System.out.println("Thank you! Closing the lid.");
        } else {
            this.hasIce = false;
            do {
                System.out.println("What would you like to put into the ice chest?");
                String item = sc.nextLine();
                System.out.printf("%s has been added to the ice chest.\n", item);
                System.out.println("Would you like to add another item?");
                userChoice = sc.nextLine();
            } while(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));
            System.out.println("Thank you! Closing the lid.");
        }
    }
}
