package BirdPackage;

public class Bird {
//    Can a bird fly?
    private boolean canFly;

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

//    What kind of bird?
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println(this.getName() + "goes Tweet tweet");
//        for super makeNoise();
//        System.out.print(this.getName() + " goes ");
    }

    public void move() {
        System.out.println("Flap flap");
    }


//    Default constructor \ creates a new object
    public Bird() {
        System.out.println("A bird just got created");
        this.canFly = true;
        this.name = "Parrot";
    }

    public Bird(String nameOfBird, boolean itCanFly) {
        this.name = nameOfBird;
        this.canFly = itCanFly;
    }
}
