package util;

import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {

        System.out.println("Give me a yes or no");
        String yesNoAnswer = this.scanner.nextLine();
        boolean result = false;

        if (yesNoAnswer.equalsIgnoreCase("yes") || yesNoAnswer.equalsIgnoreCase("y")) {
            System.out.println("You answered yes!");
            result = true;
        }else {
            System.out.println("You answered no!");
            result = false;
        }
        return result;
    }

//    public int getInt(){return this.scanner.nextInt();}

//    public int getInt(int min, int max) {
//        System.out.println("Give me a number between" + min + " and " + max);
//        int userInt = scanner.nextInt();
//
//        if (userInt >= min && userInt <= max) {
//            System.out.println("Congrats!" + userInt + " is within " + min + " and " + max);
//            return userInt;
//        }else {
//            System.out.println("Sorry that number was out of range. Try again");
//            return getInt(min, max);
//        }
//    }


    @SuppressWarnings("all")

    public int getInt(){
        System.out.print("Enter a number: ");
        try{
            String userInput = getString();
            System.out.println(userInput);
            return Integer.valueOf(getString());
        }catch(NumberFormatException nfe){
            System.out.println("That's not a number!");
            return getInt();
        }
    }



//    public double getDouble(){return this.scanner.nextDouble();}
//
//    public double getDouble( double min, double max) {
//        System.out.println("Give me a decimal number between" + min + " and " + max);
//        double userInt = scanner.nextDouble();
//
//        if (userInt > min && userInt < max) {
//            System.out.println("Congrats!" + userInt + " is within " + min + " and " + max);
//        }else {
//            System.out.println("Sorry that number was out of range. Try again");
//            getDouble(min, max);
//        }
//        return userInt;
//    }

//    public double getDouble(){
//        String userInput = getString();
//        try{
//            Double.valueOf(userInput);
//        }catch(NumberFormatException nfe){
//            System.out.println("That's not a double!");
//            getDouble();
//        }
//        return Double.parseDouble(userInput);
//    }

    public double getDouble(){
        System.out.print("Enter a number: ");
        try{
            String userInput = getString();
            System.out.println(userInput);
            return Double.valueOf(getString());
        }catch(NumberFormatException nfe){
            System.out.println("That's not a number!");
            return getDouble();
        }
    }

//    public int getBinary(){
//        String userInput = getString();
//        try{
//            .valueOf(userInput);
//        }catch(NumberFormatException nfe){
//            System.out.println("That's not a double!");
//            getDouble();
//        }
//        return Double.parseDouble(userInput);
//    }

}
