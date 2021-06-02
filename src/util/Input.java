package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Give me a string");

        String newString = scanner.nextLine();
        System.out.println(newString);

        return newString;
    }

    public boolean yesNo() {
        System.out.println("Give me a yes or no");
        String yesNoAnswer = scanner.nextLine();
        boolean result = false;

        if (yesNoAnswer.equalsIgnoreCase("yes")) {
            System.out.println("You answered yes!");
            result = true;
        }else {
            System.out.println("You answered no!");
            result = false;
        }
        return result;
    }

    public int getInt(int min, int max) {
        System.out.println("Give me a number between" + min + " and " + max);
        int userInt = scanner.nextInt();

        if (userInt > min && userInt < max) {
            System.out.println("Congrats!" + userInt + " is within " + min + " and " + max);
        }else {
            System.out.println("Sorry that number was out of range. Try again");
            getInt(min, max);
        }
        return userInt;
    }


    public double getDouble( double min, double max) {
        System.out.println("Give me a number between" + min + " and " + max);
        double userInt = scanner.nextDouble();

        if (userInt > min && userInt < max) {
            System.out.println("Congrats!" + userInt + " is within " + min + " and " + max);
        }else {
            System.out.println("Sorry that number was out of range. Try again");
            getDouble(min, max);
        }
        return userInt;
    }


}
