package BirdPackage;

import BirdPackage.Bird;

public class Finch extends Bird {
//Inherits makeNoise from bird


    public void makeNoise() {
//        BirdPackage.Finch,makeNoise();
    }


    public Finch() {
        System.out.println("A BirdPackage.Finch just got created");
    }

    public Finch(String name, boolean canItFly) {
        this.setName(name);
        this.setCanFly(canItFly);
    }
}
