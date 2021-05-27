import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Talk to Bob");

        String response = "";

        while (!response.equalsIgnoreCase("QUIT")) {
            System.out.println("What do you want?");
            response = scanner.nextLine();
            if (response.endsWith("?")) {
                System.out.println("Sure");
            }else if (response.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            }else if (response.isEmpty()) {
                System.out.println("Fine. Be that way!");
            }else {
                System.out.println("Whatever");
            }
        }
        System.out.println("I'm out of here...");





    }
}
