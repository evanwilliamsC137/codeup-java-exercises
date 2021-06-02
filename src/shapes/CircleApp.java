package shapes;

import java.util.Scanner;

import util.Input;

public class CircleApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter the radius: ");

        double radius = sc.nextDouble();

        double area = Math.PI * (radius * radius);
        System.out.println("The area of this circle is: " + area);

        double circumference= Math.PI * 2 * radius;
        System.out.println( "The circumference of this circle is: " + circumference) ;
    }



}
