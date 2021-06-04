package KitchenApp;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Refrigerator extends Appliance implements StoreFood {

//    private boolean hasIce;
    private boolean hasShelves;

//    public boolean isHasIce() {
//        return hasIce;
//    }
    public boolean isHasShelves() {
        return hasShelves;
    }

//    public void setHasIce(boolean hasIce) {
//        this.hasIce = hasIce;
//    }

    public void setHasShelves(boolean hasShelves) {
        this.hasShelves = hasShelves;
    }



    public void setType(String type) {
        this.type = type;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Refrigerator(String type, String brandName, boolean hasShelves) {
        super(type, brandName);
        this.hasShelves = hasShelves;
    }

    public Refrigerator(String type, String brandname) {
        super(type, brandname);
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void keepFresh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to put something in the fridge? (Y/N)");
        String userChoice = sc.nextLine();

        while (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
            System.out.println("What would you like to put in the fridge?");
            String item = sc.nextLine();
            System.out.printf("Sounds good! Ill keep %s cold for you\n", item);
            System.out.println("Would you like to put more in?");
            userChoice = sc.nextLine();
        }
        System.out.println("Stay cool");
    }
}
