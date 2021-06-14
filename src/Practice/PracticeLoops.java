package Practice;

import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeLoops {


    public static long getPower(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("Give me 10 numbers");
        ArrayList<Integer> nums = new ArrayList<>();
//        while (nums )

    }
}
