package OOPLecture;

import java.util.Scanner;

public class Car {
    public static Scanner scanner = new Scanner(System.in);
    public String model;
    public int year;
    public String color;
    public void run() {
        System.out.println("Car is running");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);

        car1.color = "Black";
        car1.year = 2020;
        car1.model = "Toyota Camry";

        System.out.println(car1.color);

        Car car2 = new Car();

        car2.color = "Blue";
        car2.year = 2021;
        car2.model = "Toyota Camry";
        car2.run();

        System.out.println(car2.color);
    }
}
