import java.util.Arrays;

public class ArrayLec {
    public static void main(String[] args) {
        int[] numbers = {14, 64, 34, 44};

        numbers[1] = 33;

//        This is out of bounds cause not that many in array
//        numbers[4] = 73;

//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

//        for (int number : numbers) {
//            System.out.println(number);
//        }

        String[] topFiveBoyNames = new String[6];

        topFiveBoyNames[0] = "Greg";
        topFiveBoyNames[1] = "Jim";
        topFiveBoyNames[2] = "Geoff";
        topFiveBoyNames[3] = "Naysa";
        topFiveBoyNames[4] = "David";

        for (String name : topFiveBoyNames) {
            System.out.println(name);
        }

        boolean[] lookingAtDefaultVals = new boolean[3];

        for (boolean boo : lookingAtDefaultVals) {
            System.out.println(boo);
        }

        Arrays.fill(lookingAtDefaultVals, true);

        for (boolean boo : lookingAtDefaultVals) {
            System.out.println(boo);
        }

        Arrays.fill(topFiveBoyNames, "jim");
        topFiveBoyNames[0] = "Evan";

        for (String name : topFiveBoyNames) {
            System.out.println(name);
        }

        int[] alsoNums = {14, 33, 34, 44};

        for (int number : numbers) {
            System.out.println(number);
        }

        for (int number : alsoNums) {
            System.out.println(number);
        }

        System.out.println(Arrays.equals(numbers, alsoNums));
//        System.out.println(numbers == alsoNums);

//        System.out.println(numbers);
//        System.out.println(alsoNums);


        int[] yetMoreNums = Arrays.copyOf(numbers, 5);

        for (int number : yetMoreNums) {
            System.out.println(number);
        }

        int[] numbersAgain = numbers;

        System.out.println(numbersAgain == numbers);
        System.out.println(yetMoreNums == numbers);


        int[] unsortedNightmare = {99, -19, 88, 0, 3, 44, 13};

        Arrays.sort(unsortedNightmare);
        System.out.println(Arrays.toString(unsortedNightmare));

        char[][] letters = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };


        for (char[] row : letters) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (char n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");
        }


    }

