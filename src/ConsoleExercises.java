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
//        System.out.format("The value of PI is approximately: %.2f ", pi);


        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give me a number.");
//        int num = scanner.nextInt();
//        System.out.printf("You entered: %d%n", num);
//
//        System.out.println("Give me three words");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("Your three words were: %n%s%n%s%n%s%n", firstWord, secondWord, thirdWord);

//
//        System.out.println("Enter a sentence");
//        scanner.nextLine();
//        String userInput = scanner.nextLine();
//        System.out.printf("Your sentence was: \"%s\"%n", userInput);
//


        System.out.println("Give me a length in meters:");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.printf("Length entered: %d meters.%nGive me a width in meters:%n", length);
        int width = Integer.parseInt(scanner.nextLine());
        int area = length * width;
        int perimeter = (2 * width) + (2 * length);
        System.out.printf("Length entered: %d meters.%nWidth entered: %d meters.%nArea of room: %d meters squared.%nPerimeter of room %d meters.%n", length, width, area, perimeter);



    }
}
