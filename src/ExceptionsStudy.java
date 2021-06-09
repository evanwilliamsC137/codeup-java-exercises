import java.util.Scanner;

public class ExceptionsStudy {
    public String mightBeAnInteger = "42";
    public String definitelyNotAnInteger = "Nope, Im not an integer. im a string";


    public void askForAnInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String userInput = scanner.nextLine();
        try {
            int userInputInteger = Integer.parseInt(userInput);
            System.out.println("The integer in your string is: " + userInputInteger);
        }catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage() + " There is no integer");
        }finally {
            System.out.println("Thank you for using this complex and useful application.");
            System.out.println("Please come back and visit us.");
        }
    }

    public void aMoreComplexAskForInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me an integer");
        String userInput = scanner.nextLine();
        try {
            int userInputInteger = Integer.parseInt(userInput, 10, 15, 10);
            System.out.println("thank you for entering: " + userInputInteger);
        }catch (NumberFormatException nfe) {
            System.out.println(" no integer between 10 and 15");
        }catch (IndexOutOfBoundsException iobe) {
            System.out.println("Your string wastn long enough");
        }finally {
            System.out.println("Thank you for visiting our app");
        }
    }
}
