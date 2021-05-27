import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Talk to Bob");
//
//        String userResponse = "";
//        do {
            System.out.println("Say something to Bob.");
            String saidSomething = scanner.nextLine();
            if (saidSomething.endsWith("?")) {
                System.out.println("Sure");
            }else if (saidSomething.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            }else if (saidSomething.isEmpty()) {
                System.out.println("Fine. Be that way!");
            }else {
                System.out.println("Whatever");
            }

//            System.out.println("Would like to continue?\nEnter yes to continue or no to stop.");
//            userResponse = scanner.next();
//        } while (userResponse.equals("yes"));
    }
}
