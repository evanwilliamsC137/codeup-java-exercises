package BirdPackage;

import BirdPackage.Bird;

public class Penguin extends Bird {

//    override makenoise
    public void makeNoise() {
        System.out.println(this.getName() + " goes honk honk!");
    }

//    override
    public void move() {
        System.out.println(this.getName() + " goes waddle waddle!");
    }
}
