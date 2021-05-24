import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        String name = "Edward";
//        System.out.printf("Hello, %s%n", name);
//
//        System.out.format("%d is %s's favorite number\nThis is a %b statement\n", 42, name, true);
//        System.out.println("New line");
//
//        System.out.println("Hello, " + name);
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Hey man, how's it going?");
//        String userInput = scanner.nextLine();
//
//        System.out.printf("You're feeling: %s%n", userInput);
//
//
//
//        System.out.printf("Your number: %d%n", num);


//        double pi = 3.14159;
//        System.out.printf("The value of PI is: " + pi);


        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give me a number.");
//        int num = scanner.nextInt();
//
//        System.out.println("Give me three words");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("Your three words were: %n%s%n%s%n%s%n", firstWord, secondWord, thirdWord);

//        System.out.println("Enter a sentence");
//        String userInput = scanner.nextLine();
//
//        System.out.printf("Your sentence was: %s%n", userInput);

        System.out.println("Give me the length and width of the classroom");
//        String userInput = scanner.nextLine();
        Object L = scanner.nextInt();
        Object W = scanner.nextInt();
        int leng = (int) L;
        int wid = (int) W;

        System.out.printf("The area is %d while the perimeter is %d", leng*wid, (2*leng) + (2*wid));



    }
}
