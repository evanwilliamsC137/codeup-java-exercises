package BirdPackage;

import BirdPackage.Bird;

public class Duck extends Bird {
    //BirdPackage.Duck inherits from BirdPackage.Bird.
    //BirdPackage.Duck inherits all public methods
//    overrides makeNoise() from bird


//    Have to fulfill the protocal
//    The argument must be the same and return types compatible
//    if you change arguments or return types, you are overloading not overriding
    public void makeNoise() {
//        super.makeNoise();
//        System.out.println("Quack Quack!");
        System.out.println(this.getName() + " goes quack quack!");
    }


    public void setName(String duckName) {
        super.setName(duckName);
    }
}
