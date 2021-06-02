package shapes;

import java.util.Scanner;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("What is the radius?");
        Input in = new Input();

        Circle circle2 = new Circle(in.getDouble());

        System.out.println("The circumference is: " + circle2.getCircumference());
        System.out.println("The area is: " + circle2.getArea());

    }
}
