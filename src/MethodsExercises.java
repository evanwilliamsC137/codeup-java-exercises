import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

//    public static int add(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int subtract(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int multiply(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static int divide(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public static int modulus(int num1, int num2) {
//        return num1 % num2;
//    }
//
//    public static int getInteger(int min, int max){
//        System.out.printf("Give me a number between %d and %d\n", min, max);
//        Scanner scanner = new Scanner(System.in);
//        int userNumber = scanner.nextInt();
//
//        if ((userNumber > max) || (userNumber < min)) {
//            System.out.println("Try again!");
//            return getInteger(min, max);
//        } else {
//            System.out.printf("Thank you for following directions! Your number was %d!%n", userNumber);
//            return userNumber;
//        }
//
//    }

//    public static void factorials(int num){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give me a number between 1-10");
//        num = scanner.nextInt();
//        int i = 1;
//        long fact = 1;
//
//        for(i = 1; i <= num; i++){
//            fact = fact * i;
//        }
//        System.out.println(num + "! is: " + fact);
//    }




    public static void diceRoll(){
        System.out.println("How many sides do you want?");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= 4; i++) {
            String yes = "y";
            String no = "n";
            System.out.println("Roll again? (y/n)");
            Scanner sc = new Scanner(System.in);
            String userReply = scanner.next();

            if (userReply.equals(yes)) {
                int dice1;
                int dice2;
                int roll;

                dice1 = (int) (Math.random()* userNumber + 1);
                dice2 = (int) (Math.random()* userNumber + 1);
                roll = dice1 + dice2;

                System.out.println("First die" + dice1);
                System.out.println("2nd die" + dice2);
                System.out.println("Total roll" + roll);


                System.out.println("Continue (y/n)");
                String choice = scanner.next();
                if (choice.equals(yes)) {
                    continue;
                }else {
                    break;
                }
            }
        }


//        System.out.println("Would you like to roll?");
//        String doRoll =
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many sides are on the dice?");
//        int userNumber = scanner.nextInt();
//        int dice1 = (int) (Math.random()* userNumber + 1);
//        int dice2 = (int) (Math.random()* userNumber + 1);
//        System.out.printf("dice 1: %d%ndice 2: %d%n",dice1,dice2);




    }



    public static void main(String[] args) {
//        System.out.println(add(2, 2));
//        System.out.println(subtract(2, 2));
//        System.out.println(multiply(5, 5));
//        System.out.println(divide(5, 5));
//        System.out.println(modulus(9, 2));
//        getInteger(1,10);
//        System.out.println(factorials());
//        factorials();
//        System.out.println(diceRoll());
        diceRoll();
    }


//    public static void sayHello() {
//        System.out.printf("Sorry, in bit of a rush");
//    }
//
//    public static void sayHello(String name) {
//        System.out.printf("Hi there! My name is %s! Have a great day!%n",name);
//    }
//
//    public static void sayHello(String salutation, String name) {
//        System.out.printf("%s there! My name is %s! Have a great day!%n",salutation,name);
//    }
//
//    public static void sayHello(int times) {
//        for(int i = 1; i <= times; i++) {
//            System.out.println("Hello, darling!");
//        }
//    }
//
//    public static int multiply(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static void Splashmore(Scanner sc) {
//        System.out.println("Take us to splashmore?");
//        if (!sc.nextLine().equalsIgnoreCase("yes")){
//            Splashmore(sc);
//        }else {
//            System.out.println("Thanks dad!");
//        }
//    }
//
//    public static void bottlesOfBlank(String beverage, int numOfBottles) {
//        if (numOfBottles == 0) {
//            System.out.printf("No more bottles of %s on the wall%nNo more bottles of %s%nStand up now, stumble around$nAll of the bottle of %s on the wall%n",beverage,beverage,beverage);
//        } else if (numOfBottles == 1) {
//            System.out.printf("1 bottle of %s on the wall%n1 bottle of %s%nTake it down, pass it around%nNo more bottles of %s on the wall",beverage,beverage,beverage);
//            bottlesOfBlank(beverage, numOfBottles - 1);
//        }else if (numOfBottles == 2) {
//            System.out.printf("2 bottle of %s on the wall%n2 bottle of %s%nTake it down, pass it around%nNo more bottles of %s on the wall",beverage,beverage,beverage);
//            bottlesOfBlank(beverage, numOfBottles - 1);
//        }else {
//            System.out.printf("%d bottle of %s on the wall%n%d bottle of %s%nTake it down, pass it around%nNo more bottles of %s on the wall",numOfBottles,beverage,numOfBottles,beverage,numOfBottles - 1, beverage);
//            bottlesOfBlank(beverage, numOfBottles - 1);
//        }
//    }
//
//
//    public static void main(String[] args) {
//        sayHello();
//        sayHello("Evan");
//        sayHello("Howdy","Evan");
//        sayHello(4);
//        System.out.println(multiply(5, 2));
//        int product = multiply(7,3);
//        System.out.printf("Did you know that %d X %d = 's %d%n", product,product,product*product);
//        Splashmore(new Scanner(System.in));
//        bottlesOfBlank("surge",9);
//    }
}
