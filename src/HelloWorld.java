public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /**
         *
         * Multi line comments in here
         *
         * */
        System.out.println("New line my dudes");

        byte smallNumber = 34;
        System.out.println(smallNumber);

        short notAsSmallNumber = 30000;

        int num = 4500000;

        long largeNumber = 14;

        System.out.println(largeNumber);

        float decimal = 1.5F;

        double bigDecimal = 45;
        System.out.println(bigDecimal);

        char singleLetter = 'g';

        final char SINGLE_LETTER = 'j';

//        SINGLE_LETTER = 'J'; final acts as a constant

        boolean AmILearningJava = true;

        String message = "How's it going?\n Everything \"alright?\"\n\t";
        System.out.println(message);

        int sum = 4 + 5;
        System.out.println(sum);

        int difference = 72 - 19;
        System.out.println(difference);

        int product = 11 * 9;
        System.out.println(product);

        int quotient = product / sum;
        System.out.println(quotient);

        int remainder = difference % sum;
        System.out.println(remainder);

        long longNum = 45000;
        int intNum = 45000;

        long bigSum = longNum + intNum;
        System.out.println(bigSum);

        int whatWillThisBe = -4 * 2;
        System.out.println(whatWillThisBe);

        System.out.println(sum++);
        System.out.println(sum);

        int iAmAnInt = 44;
        long iAmALong = iAmAnInt;
        System.out.println(iAmALong);

        iAmALong = 99;
        iAmAnInt = (int) (iAmALong);
        System.out.println(iAmAnInt);

        iAmAnInt = 27;
        double iAmADouble = iAmAnInt;
        System.out.println(iAmADouble);

        iAmADouble = 3.141598;
        iAmAnInt = (int) iAmADouble;
        System.out.println(iAmAnInt);


        System.out.println((char) 44);

        int myFavoriteNumber = 0;
        System.out.println(myFavoriteNumber);

        String myString = "This is a string";
        System.out.println(myString);

        myString = "c";
        System.out.println(myString);

//        no value assigned causes error in logging
//        long myNumber = 123L;
//        System.out.println(myNumber);

//        float myNumber = 3.14F;
//        float myNumber = (float) 3.14;
//        System.out.println(myNumber);

//        adds after redecleration
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        Adds before to show next value
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";
//        System.out.println(three);

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

        int max = Integer.MAX_VALUE;
        System.out.println(++max);





    }
}
