package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Give me a string");

        String newString = scanner.nextLine();

        return newString;
    }

    public boolean yesNo() {
        System.out.println("Give me a yes or no");
        String yesNoAnswer = scanner.nextLine();

        if (yesNoAnswer.equalsIgnoreCase("yes")) {
            return true;
        }else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        min = 0;
        max = 100;
        System.out.println("Give me a number between" + min + " and " + max);
        int userInt = scanner.nextInt();

        if (userInt > min && userInt < max) {
            System.out.println("Congrats!" + userInt + " is within the min and max");
        }else {
            System.out.println("Sorry that number was out of range. Try again");
            getInt();
        }
        return userInt;
    }

    int getInt (){};

    public static void main(String[] args) {

    }

}
